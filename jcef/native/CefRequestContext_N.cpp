// Copyright (c) 2014 The Chromium Embedded Framework Authors. All rights
// reserved. Use of this source code is governed by a BSD-style license that
// can be found in the LICENSE file.

#include "CefRequestContext_N.h"
#include "completion_callback.h"
#include "include/base/cef_callback.h"
#include "include/cef_request_context.h"
#include "jni_util.h"
#include "request_context_handler.h"

namespace {

CefRefPtr<CefRequestContext> GetSelf(jlong self) {
  return reinterpret_cast<CefRequestContext*>(self);
}

}  // namespace

JNIEXPORT jobject JNICALL
Java_org_cef_browser_CefRequestContext_1N_N_1GetGlobalContext(JNIEnv* env,
                                                              jclass cls) {
  CefRefPtr<CefRequestContext> context = CefRequestContext::GetGlobalContext();
  if (!context.get())
    return nullptr;

  ScopedJNIObjectLocal jContext(env, NewJNIObject(env, cls));
  if (!jContext)
    return nullptr;

  SetCefForJNIObject_sync(env, jContext, context.get(), "CefRequestContext");
  return jContext.Release();
}

JNIEXPORT jobject JNICALL
Java_org_cef_browser_CefRequestContext_1N_N_1CreateContext(JNIEnv* env,
                                                           jclass cls,
                                                           jobject jhandler) {
  CefRefPtr<CefRequestContextHandler> handler = nullptr;
  if (jhandler != nullptr) {
    handler = new RequestContextHandler(env, jhandler);
  }

  // TODO(JCEF): Expose CefRequestContextSettings.
  CefRequestContextSettings settings;
  CefRefPtr<CefRequestContext> context =
      CefRequestContext::CreateContext(settings, handler);
  if (!context.get())
    return nullptr;

  ScopedJNIObjectLocal jContext(env, NewJNIObject(env, cls));
  if (!jContext)
    return nullptr;

  SetCefForJNIObject_sync(env, jContext, context.get(), "CefRequestContext");
  return jContext.Release();
}

JNIEXPORT jboolean JNICALL
Java_org_cef_browser_CefRequestContext_1N_N_1IsGlobal(JNIEnv* env,
                                                      jobject obj) {
  CefRefPtr<CefRequestContext> context =
      GetCefFromJNIObject_sync<CefRequestContext>(env, obj, "CefRequestContext");
  if (!context.get())
    return JNI_FALSE;
  return context->IsGlobal() ? JNI_TRUE : JNI_FALSE;
}

JNIEXPORT void JNICALL
Java_org_cef_browser_CefRequestContext_1N_N_1CefRequestContext_1DTOR(
    JNIEnv* env,
    jobject obj) {
  SetCefForJNIObject_sync<CefRequestContext>(env, obj, nullptr, "CefRequestContext");
}

JNIEXPORT void JNICALL
Java_org_cef_browser_CefRequestContext_1N_N_1ClearCertificateExceptions(
    JNIEnv* env,
    jobject,
    jlong self,
    jobject jcallback) {
  CefRefPtr<CefRequestContext> request_context = GetSelf(self);
  CefRefPtr<CefCompletionCallback> callback =
      new CompletionCallback(env, jcallback);
  request_context->ClearCertificateExceptions(callback);
}

JNIEXPORT void JNICALL
Java_org_cef_browser_CefRequestContext_1N_N_1CloseAllConnections(
    JNIEnv* env,
    jobject,
    jlong self,
    jobject jcallback) {
  CefRefPtr<CefRequestContext> request_context = GetSelf(self);
  CefRefPtr<CefCompletionCallback> callback =
      new CompletionCallback(env, jcallback);
  request_context->CloseAllConnections(callback);
}
