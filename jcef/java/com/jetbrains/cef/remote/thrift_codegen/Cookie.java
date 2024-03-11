/**
 * Autogenerated by Thrift Compiler (0.19.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.jetbrains.cef.remote.thrift_codegen;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class Cookie implements org.apache.thrift.TBase<Cookie, Cookie._Fields>, java.io.Serializable, Cloneable, Comparable<Cookie> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Cookie");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DOMAIN_FIELD_DESC = new org.apache.thrift.protocol.TField("domain", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("path", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField SECURE_FIELD_DESC = new org.apache.thrift.protocol.TField("secure", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField HTTPONLY_FIELD_DESC = new org.apache.thrift.protocol.TField("httponly", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField CREATION_FIELD_DESC = new org.apache.thrift.protocol.TField("creation", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField LAST_ACCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("lastAccess", org.apache.thrift.protocol.TType.I64, (short)8);
  private static final org.apache.thrift.protocol.TField EXPIRES_FIELD_DESC = new org.apache.thrift.protocol.TField("expires", org.apache.thrift.protocol.TType.I64, (short)9);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CookieStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CookieTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String name; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String value; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String domain; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String path; // required
  public boolean secure; // required
  public boolean httponly; // required
  public long creation; // required
  public long lastAccess; // required
  public long expires; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    VALUE((short)2, "value"),
    DOMAIN((short)3, "domain"),
    PATH((short)4, "path"),
    SECURE((short)5, "secure"),
    HTTPONLY((short)6, "httponly"),
    CREATION((short)7, "creation"),
    LAST_ACCESS((short)8, "lastAccess"),
    EXPIRES((short)9, "expires");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // VALUE
          return VALUE;
        case 3: // DOMAIN
          return DOMAIN;
        case 4: // PATH
          return PATH;
        case 5: // SECURE
          return SECURE;
        case 6: // HTTPONLY
          return HTTPONLY;
        case 7: // CREATION
          return CREATION;
        case 8: // LAST_ACCESS
          return LAST_ACCESS;
        case 9: // EXPIRES
          return EXPIRES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SECURE_ISSET_ID = 0;
  private static final int __HTTPONLY_ISSET_ID = 1;
  private static final int __CREATION_ISSET_ID = 2;
  private static final int __LASTACCESS_ISSET_ID = 3;
  private static final int __EXPIRES_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.EXPIRES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DOMAIN, new org.apache.thrift.meta_data.FieldMetaData("domain", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PATH, new org.apache.thrift.meta_data.FieldMetaData("path", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SECURE, new org.apache.thrift.meta_data.FieldMetaData("secure", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.HTTPONLY, new org.apache.thrift.meta_data.FieldMetaData("httponly", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CREATION, new org.apache.thrift.meta_data.FieldMetaData("creation", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LAST_ACCESS, new org.apache.thrift.meta_data.FieldMetaData("lastAccess", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.EXPIRES, new org.apache.thrift.meta_data.FieldMetaData("expires", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Cookie.class, metaDataMap);
  }

  public Cookie() {
  }

  public Cookie(
    java.lang.String name,
    java.lang.String value,
    java.lang.String domain,
    java.lang.String path,
    boolean secure,
    boolean httponly,
    long creation,
    long lastAccess)
  {
    this();
    this.name = name;
    this.value = value;
    this.domain = domain;
    this.path = path;
    this.secure = secure;
    setSecureIsSet(true);
    this.httponly = httponly;
    setHttponlyIsSet(true);
    this.creation = creation;
    setCreationIsSet(true);
    this.lastAccess = lastAccess;
    setLastAccessIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Cookie(Cookie other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetValue()) {
      this.value = other.value;
    }
    if (other.isSetDomain()) {
      this.domain = other.domain;
    }
    if (other.isSetPath()) {
      this.path = other.path;
    }
    this.secure = other.secure;
    this.httponly = other.httponly;
    this.creation = other.creation;
    this.lastAccess = other.lastAccess;
    this.expires = other.expires;
  }

  @Override
  public Cookie deepCopy() {
    return new Cookie(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.value = null;
    this.domain = null;
    this.path = null;
    setSecureIsSet(false);
    this.secure = false;
    setHttponlyIsSet(false);
    this.httponly = false;
    setCreationIsSet(false);
    this.creation = 0;
    setLastAccessIsSet(false);
    this.lastAccess = 0;
    setExpiresIsSet(false);
    this.expires = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public Cookie setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getValue() {
    return this.value;
  }

  public Cookie setValue(@org.apache.thrift.annotation.Nullable java.lang.String value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDomain() {
    return this.domain;
  }

  public Cookie setDomain(@org.apache.thrift.annotation.Nullable java.lang.String domain) {
    this.domain = domain;
    return this;
  }

  public void unsetDomain() {
    this.domain = null;
  }

  /** Returns true if field domain is set (has been assigned a value) and false otherwise */
  public boolean isSetDomain() {
    return this.domain != null;
  }

  public void setDomainIsSet(boolean value) {
    if (!value) {
      this.domain = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPath() {
    return this.path;
  }

  public Cookie setPath(@org.apache.thrift.annotation.Nullable java.lang.String path) {
    this.path = path;
    return this;
  }

  public void unsetPath() {
    this.path = null;
  }

  /** Returns true if field path is set (has been assigned a value) and false otherwise */
  public boolean isSetPath() {
    return this.path != null;
  }

  public void setPathIsSet(boolean value) {
    if (!value) {
      this.path = null;
    }
  }

  public boolean isSecure() {
    return this.secure;
  }

  public Cookie setSecure(boolean secure) {
    this.secure = secure;
    setSecureIsSet(true);
    return this;
  }

  public void unsetSecure() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SECURE_ISSET_ID);
  }

  /** Returns true if field secure is set (has been assigned a value) and false otherwise */
  public boolean isSetSecure() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SECURE_ISSET_ID);
  }

  public void setSecureIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SECURE_ISSET_ID, value);
  }

  public boolean isHttponly() {
    return this.httponly;
  }

  public Cookie setHttponly(boolean httponly) {
    this.httponly = httponly;
    setHttponlyIsSet(true);
    return this;
  }

  public void unsetHttponly() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HTTPONLY_ISSET_ID);
  }

  /** Returns true if field httponly is set (has been assigned a value) and false otherwise */
  public boolean isSetHttponly() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HTTPONLY_ISSET_ID);
  }

  public void setHttponlyIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HTTPONLY_ISSET_ID, value);
  }

  public long getCreation() {
    return this.creation;
  }

  public Cookie setCreation(long creation) {
    this.creation = creation;
    setCreationIsSet(true);
    return this;
  }

  public void unsetCreation() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CREATION_ISSET_ID);
  }

  /** Returns true if field creation is set (has been assigned a value) and false otherwise */
  public boolean isSetCreation() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CREATION_ISSET_ID);
  }

  public void setCreationIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CREATION_ISSET_ID, value);
  }

  public long getLastAccess() {
    return this.lastAccess;
  }

  public Cookie setLastAccess(long lastAccess) {
    this.lastAccess = lastAccess;
    setLastAccessIsSet(true);
    return this;
  }

  public void unsetLastAccess() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LASTACCESS_ISSET_ID);
  }

  /** Returns true if field lastAccess is set (has been assigned a value) and false otherwise */
  public boolean isSetLastAccess() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LASTACCESS_ISSET_ID);
  }

  public void setLastAccessIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LASTACCESS_ISSET_ID, value);
  }

  public long getExpires() {
    return this.expires;
  }

  public Cookie setExpires(long expires) {
    this.expires = expires;
    setExpiresIsSet(true);
    return this;
  }

  public void unsetExpires() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EXPIRES_ISSET_ID);
  }

  /** Returns true if field expires is set (has been assigned a value) and false otherwise */
  public boolean isSetExpires() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EXPIRES_ISSET_ID);
  }

  public void setExpiresIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EXPIRES_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((java.lang.String)value);
      }
      break;

    case DOMAIN:
      if (value == null) {
        unsetDomain();
      } else {
        setDomain((java.lang.String)value);
      }
      break;

    case PATH:
      if (value == null) {
        unsetPath();
      } else {
        setPath((java.lang.String)value);
      }
      break;

    case SECURE:
      if (value == null) {
        unsetSecure();
      } else {
        setSecure((java.lang.Boolean)value);
      }
      break;

    case HTTPONLY:
      if (value == null) {
        unsetHttponly();
      } else {
        setHttponly((java.lang.Boolean)value);
      }
      break;

    case CREATION:
      if (value == null) {
        unsetCreation();
      } else {
        setCreation((java.lang.Long)value);
      }
      break;

    case LAST_ACCESS:
      if (value == null) {
        unsetLastAccess();
      } else {
        setLastAccess((java.lang.Long)value);
      }
      break;

    case EXPIRES:
      if (value == null) {
        unsetExpires();
      } else {
        setExpires((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case VALUE:
      return getValue();

    case DOMAIN:
      return getDomain();

    case PATH:
      return getPath();

    case SECURE:
      return isSecure();

    case HTTPONLY:
      return isHttponly();

    case CREATION:
      return getCreation();

    case LAST_ACCESS:
      return getLastAccess();

    case EXPIRES:
      return getExpires();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case VALUE:
      return isSetValue();
    case DOMAIN:
      return isSetDomain();
    case PATH:
      return isSetPath();
    case SECURE:
      return isSetSecure();
    case HTTPONLY:
      return isSetHttponly();
    case CREATION:
      return isSetCreation();
    case LAST_ACCESS:
      return isSetLastAccess();
    case EXPIRES:
      return isSetExpires();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof Cookie)
      return this.equals((Cookie)that);
    return false;
  }

  public boolean equals(Cookie that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    boolean this_present_domain = true && this.isSetDomain();
    boolean that_present_domain = true && that.isSetDomain();
    if (this_present_domain || that_present_domain) {
      if (!(this_present_domain && that_present_domain))
        return false;
      if (!this.domain.equals(that.domain))
        return false;
    }

    boolean this_present_path = true && this.isSetPath();
    boolean that_present_path = true && that.isSetPath();
    if (this_present_path || that_present_path) {
      if (!(this_present_path && that_present_path))
        return false;
      if (!this.path.equals(that.path))
        return false;
    }

    boolean this_present_secure = true;
    boolean that_present_secure = true;
    if (this_present_secure || that_present_secure) {
      if (!(this_present_secure && that_present_secure))
        return false;
      if (this.secure != that.secure)
        return false;
    }

    boolean this_present_httponly = true;
    boolean that_present_httponly = true;
    if (this_present_httponly || that_present_httponly) {
      if (!(this_present_httponly && that_present_httponly))
        return false;
      if (this.httponly != that.httponly)
        return false;
    }

    boolean this_present_creation = true;
    boolean that_present_creation = true;
    if (this_present_creation || that_present_creation) {
      if (!(this_present_creation && that_present_creation))
        return false;
      if (this.creation != that.creation)
        return false;
    }

    boolean this_present_lastAccess = true;
    boolean that_present_lastAccess = true;
    if (this_present_lastAccess || that_present_lastAccess) {
      if (!(this_present_lastAccess && that_present_lastAccess))
        return false;
      if (this.lastAccess != that.lastAccess)
        return false;
    }

    boolean this_present_expires = true && this.isSetExpires();
    boolean that_present_expires = true && that.isSetExpires();
    if (this_present_expires || that_present_expires) {
      if (!(this_present_expires && that_present_expires))
        return false;
      if (this.expires != that.expires)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetValue()) ? 131071 : 524287);
    if (isSetValue())
      hashCode = hashCode * 8191 + value.hashCode();

    hashCode = hashCode * 8191 + ((isSetDomain()) ? 131071 : 524287);
    if (isSetDomain())
      hashCode = hashCode * 8191 + domain.hashCode();

    hashCode = hashCode * 8191 + ((isSetPath()) ? 131071 : 524287);
    if (isSetPath())
      hashCode = hashCode * 8191 + path.hashCode();

    hashCode = hashCode * 8191 + ((secure) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((httponly) ? 131071 : 524287);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(creation);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(lastAccess);

    hashCode = hashCode * 8191 + ((isSetExpires()) ? 131071 : 524287);
    if (isSetExpires())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(expires);

    return hashCode;
  }

  @Override
  public int compareTo(Cookie other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetName(), other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetValue(), other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDomain(), other.isSetDomain());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDomain()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.domain, other.domain);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPath(), other.isSetPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.path, other.path);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSecure(), other.isSetSecure());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecure()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.secure, other.secure);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetHttponly(), other.isSetHttponly());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHttponly()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.httponly, other.httponly);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCreation(), other.isSetCreation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.creation, other.creation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetLastAccess(), other.isSetLastAccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastAccess()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastAccess, other.lastAccess);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetExpires(), other.isSetExpires());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpires()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expires, other.expires);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Cookie(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("value:");
    if (this.value == null) {
      sb.append("null");
    } else {
      sb.append(this.value);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("domain:");
    if (this.domain == null) {
      sb.append("null");
    } else {
      sb.append(this.domain);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("path:");
    if (this.path == null) {
      sb.append("null");
    } else {
      sb.append(this.path);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("secure:");
    sb.append(this.secure);
    first = false;
    if (!first) sb.append(", ");
    sb.append("httponly:");
    sb.append(this.httponly);
    first = false;
    if (!first) sb.append(", ");
    sb.append("creation:");
    sb.append(this.creation);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastAccess:");
    sb.append(this.lastAccess);
    first = false;
    if (isSetExpires()) {
      if (!first) sb.append(", ");
      sb.append("expires:");
      sb.append(this.expires);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    if (value == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'value' was not present! Struct: " + toString());
    }
    if (domain == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'domain' was not present! Struct: " + toString());
    }
    if (path == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'path' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'secure' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'httponly' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'creation' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'lastAccess' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CookieStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public CookieStandardScheme getScheme() {
      return new CookieStandardScheme();
    }
  }

  private static class CookieStandardScheme extends org.apache.thrift.scheme.StandardScheme<Cookie> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, Cookie struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.value = iprot.readString();
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DOMAIN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.domain = iprot.readString();
              struct.setDomainIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.path = iprot.readString();
              struct.setPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SECURE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.secure = iprot.readBool();
              struct.setSecureIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // HTTPONLY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.httponly = iprot.readBool();
              struct.setHttponlyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // CREATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.creation = iprot.readI64();
              struct.setCreationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // LAST_ACCESS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastAccess = iprot.readI64();
              struct.setLastAccessIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // EXPIRES
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.expires = iprot.readI64();
              struct.setExpiresIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetSecure()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'secure' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetHttponly()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'httponly' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetCreation()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'creation' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetLastAccess()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'lastAccess' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, Cookie struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.value != null) {
        oprot.writeFieldBegin(VALUE_FIELD_DESC);
        oprot.writeString(struct.value);
        oprot.writeFieldEnd();
      }
      if (struct.domain != null) {
        oprot.writeFieldBegin(DOMAIN_FIELD_DESC);
        oprot.writeString(struct.domain);
        oprot.writeFieldEnd();
      }
      if (struct.path != null) {
        oprot.writeFieldBegin(PATH_FIELD_DESC);
        oprot.writeString(struct.path);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SECURE_FIELD_DESC);
      oprot.writeBool(struct.secure);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(HTTPONLY_FIELD_DESC);
      oprot.writeBool(struct.httponly);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CREATION_FIELD_DESC);
      oprot.writeI64(struct.creation);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LAST_ACCESS_FIELD_DESC);
      oprot.writeI64(struct.lastAccess);
      oprot.writeFieldEnd();
      if (struct.isSetExpires()) {
        oprot.writeFieldBegin(EXPIRES_FIELD_DESC);
        oprot.writeI64(struct.expires);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CookieTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public CookieTupleScheme getScheme() {
      return new CookieTupleScheme();
    }
  }

  private static class CookieTupleScheme extends org.apache.thrift.scheme.TupleScheme<Cookie> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Cookie struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.name);
      oprot.writeString(struct.value);
      oprot.writeString(struct.domain);
      oprot.writeString(struct.path);
      oprot.writeBool(struct.secure);
      oprot.writeBool(struct.httponly);
      oprot.writeI64(struct.creation);
      oprot.writeI64(struct.lastAccess);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetExpires()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetExpires()) {
        oprot.writeI64(struct.expires);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Cookie struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      struct.value = iprot.readString();
      struct.setValueIsSet(true);
      struct.domain = iprot.readString();
      struct.setDomainIsSet(true);
      struct.path = iprot.readString();
      struct.setPathIsSet(true);
      struct.secure = iprot.readBool();
      struct.setSecureIsSet(true);
      struct.httponly = iprot.readBool();
      struct.setHttponlyIsSet(true);
      struct.creation = iprot.readI64();
      struct.setCreationIsSet(true);
      struct.lastAccess = iprot.readI64();
      struct.setLastAccessIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.expires = iprot.readI64();
        struct.setExpiresIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

