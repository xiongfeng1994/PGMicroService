package com.ebest.cloud.utility;
/**
 * Configure some static constants
 * @author ebest
 *
 */
public class ConstantClassField {
	/**
	 * status: open
	 */
	public static final String STATUSOPEN = "open";
	
	/**
	 * status: active
	 */
	public static final String STATUSACTIVE = "active";
	
	/**
	 * status: suspend
	 */
	public static final String STATUSSUSPEND = "suspend";
	
	/**
	 * status: closed
	 */
	public static final String STATUSCLOSED = "closed";
	
	/**
	 * isdeleted (1 : deleted)(0 : undeleted)
	 */
	public static final boolean ISDELETEDDEFAULT = false;
	
	//===============================params=====================================
	
	/**
	 * order by clause '%s %s'
	 */
	public static final String ORDERBYCLAUSE = "store.%s %s";
	/**
	 * orderByFeild
	 */
	public static final String ORDERBYFIELD = "orderByField";
	/**
	 * orderByFeild
	 */
	public static final String DESC = "desc";
	/**
	 * limit
	 */
	public static final String LIMIT = "limit";
	
	/**
	 * offset
	 */
	public static final String OFFSET = "offset";
	
	/**
	 * code
	 */
	public static final String STORECODE = "code";
	/**
	 * code
	 */
	public static final String STORECODE_COLUMN = "code";	
	/**
	 * storeName
	 */
	public static final String STORENAME = "storeName";
	/**
	 * name
	 */
	public static final String STORENAME_COLUMN = "name";
	/**
	 * cdhCode
	 */
	public static final String CDHCODE = "cdhCode";
	/**
	 * address
	 */
	public static final String ADDRESS = "address";
	/**
	 * phone
	 */
	public static final String PHONE = "phone";
	/**
	 * storeType
	 */
	public static final String STORETYPECODE = "storeTypeCode";
	/**
	 * store_type_code
	 */
	public static final String STORETYPECODE_COLUMN = "store_type_code";	
	/**
	 * channelCode
	 */
	public static final String CHANNELCODE = "channelCode";
	/**
	 * channel_code
	 */
	public static final String CHANNELCODE_COLUMN = "channel_code";
	/**
	 * locationCode
	 */
	public static final String LOCATIONCODE = "locationCode";
	/**
	 * regionCode
	 */
	public static final String REGIONCODE = "regionCode";
	/**
	 * region_Code
	 */
	public static final String REGIONCODE_COLUMN = "region_code";
	/**
	 * visitTarget
	 */
	public static final String VISITTARGET = "visitTarget";
	
	/**
	 * storeTier
	 */
	public static final String STORETIER = "storeTier";
	
	/**
	 * marketCode
	 */
	public static final String MARKETCODE = "marketCode";
	/**
	 * market_code
	 */
	public static final String MARKETCODE_COLUMN = "market_code";	
	/**
	 * bannerCode
	 */
	public static final String BANNERCODE = "bannerCode";
	/**
	 * banner_code
	 */
	public static final String BANNERCODE_COLUMN = "banner_code";	
	/**
	 * storeOwnerCode
	 */
	public static final String STOREOWNERCODE = "storeOwnerCode";
	/**
	 * store_owner_code
	 */
	public static final String STOREOWNERCODE_COLUMN = "store_owner_code";
	/**
	 * latitude
	 */
	public static final String LATITUDE = "latitude";
	
	/**
	 * longitude
	 */
	public static final String LONGITUDE = "longitude";
	
	/**
	 * openDate
	 */
	public static final String OPENDATE = "openDate";
	
	/**
	 * closeDate
	 */
	public static final String CLOSEDATE = "closeDate";
	
	/**
	 * timeInStore
	 */
	public static final String TIMEINSTORE = "timeInStore";
	
	/**
	 * status
	 */
	public static final String STATUS = "status";
	
	
	/**
	 * recUserCode
	 */
	public static final String RECUSERCODE = "API Interface";
	
	//===============================api=====================================
	
	/**
	 * searchStore
	 */
	public static final String SEARCHSTORE = "searchStore";
	
	/**
	 * searchStoreByCode
	 */
	public static final String SEARCHSTOREBYCODE = "searchStoreByCode";
	
	/**
	 * createStore
	 */
	public static final String CREATESTORE = "createStore";
	
	/**
	 * updateStore
	 */
	public static final String UPDATESTORE = "updateStore";
	
	/**
	 * deleteStore
	 */
	public static final String DELETESTORE = "deleteStore";
	
	/**
	 * application/json;charset=UTF-8
	 */
	public static final String JSONPRODUCES = "application/json;charset=UTF-8";
	/**
	 * /v1.0
	 */
	public static final String APIVERSION = "/v1.0";
	/**
	 * /store/${apiversion}/{storeCode}
	 */
	public static final String STOREANDSTORECODEPATH = APIVERSION+"/stores/{code}";
	
	/**
	 * /store/${apiversion}
	 */
	public static final String STOREPATH = APIVERSION+"/stores"; 
	
	//===============================log=====================================
	
	/**
	 *  path : 
	 */
	public static final String PATH = " path : ";
	
	/**
	 *  method : 
	 */
	public static final String METHOD = " method : ";
	
	/**
	 *  error :
	 */
	public static final String ERROR = " error : ";
	
	/**
	 *  param :
	 */
	public static final String PARAM = " param :";
	
	/**
	 *  result : 
	 */
	public static final String RESULT = " result : ";
	
	/**
	 * system error
	 */
	public static final String SYSTEMERROR = "system error";
	
	/**
	 * data validation failure
	 */
	public static final String DATAVALIDERROR = "data validation failure";
	
	/**
	 * data query failure
	 */
	public static final String DATAQUERYERROR = "data query failure";
	
	//===============================int=====================================
	
	/**
	 * offsetDefault
	 */
	public static final String OFFSETDEFAULT = "1";
	/**
	 * limitDefault
	 */
	public static final String LIMITDEFAULT = "1000";
	
	/**
	 * offsetDefault
	 */
	public static final int OFFSETDEFAULT_INT = 1;
	/**
	 * limitDefault
	 */
	public static final int LIMITDEFAULT_INT = 1000;
	
	/**
	 * code max length 50
	 */
	public static final int CODEMAXLENGTH = 50;
	
	/**
	 * name max length 100
	 */
	public static final int NAMEMAXLENGTH = 100;
	
	/**
	 * description max length 256
	 */
	public static final int DESCRIPTIONMAXLENGTH = 256;
	
	/**
	 * address max length 500
	 */
	public static final int ADDRESSMAXLENGTH = 500;
	
	/**
	 * status length
	 */
	public static final int STATUSMAXLENGTH = 50;
	
	/**
	 * the max value of store tier : 10
	 */
	public static final int STORETIERMAX = 10;
	
	/**
	 * the min value of store tier : 0
	 */
	public static final int STORETIERMIN = 0;
	
	//===============================sign=====================================
	
	/**
	 * plus sign +
	 */
	public static final String PLUSSIGN = "+";
	
	/**
	 * percent sign %
	 */
	public static final String PERCENTSIGN = "%";
	
	/**
	 * equal sign =
	 */
	public static final String EQUALSIGN = "=";
	
	/**
	 * comma ,
	 */
	public static final String COMMA = ",";
	
	//===============================swagger=====================================
	
	/**
	 * according to storeCode,storeName,storeType,bannerCode,channelCode,regionCode,marketCode,storeOwnerCode query the store
	 */
	public static final String SWAGGERQUERYSTORENOTE = "according to storeCode,storeName,storeType,bannerCode,channelCode,regionCode,marketCode,storeOwnerCode query the store";
	
	/**
	 * according to storeCode query the store
	 */
	public static final String SWAGGERQUERYSTOREBYCODENOTE = "according to storeCode query the store";
	
	/**
	 * according to StoreParams entity create the store
	 */
	public static final String SWAGGERCREATESTORENOTE = "according to StoreParams entity create the store";
	
	/**
	 * according to storeCode delete the store
	 */
	public static final String SWAGGERDELETESTORENOTE = "according to storeCode delete the store";
	
	/**
	 * according to storeParams entity update the store
	 */
	public static final String SWAGGERUPDATESTORENODE = "according to storeParams entity update the store";
	
	/**
	 * body
	 */
	public static final String SWAGGERPARAMTYPEBODY = "body";
	
	/**
	 * path
	 */
	public static final String SWAGGERPARAMTYPEPATH = "path";
	
	/**
	 * query
	 */
	public static final String SWAGGERPARAMTYPEQUERY = "query";
	
	/**
	 * search store
	 */
	public static final String SWAGGERQUERYSTOREAPIVALUE = "search store";
	
	/**
	 * search store by code
	 */
	public static final String SWAGGERQUERYSTOREBYCODEAPIVALUE = "search store by code";
	
	/**
	 * create store
	 */
	public static final String SWAGGERCREATESTOREAPIVALUE = "create store";
	
	/**
	 * update store
	 */
	public static final String SWAGGERUPDATESTOREAPIVALUE = "update store";
	
	/**
	 * delete store
	 */
	public static final String SWAGGERDELETESTOREAPIVALUE = "delete store";
	
	/**
	 * storeParams
	 */
	public static final String SWAGGERDATATYPESTOREPARAMS = "Store";
	
	/**
	 * string
	 */
	public static final String SWAGGERDATATYPESTRING = "String";
	
	/**
	 * storeParams
	 */
	public static final String SWAGGERDATASTOREPARAMS = "store";

	//===============================response-status=====================================
	
	/**
	 * path can not found 404
	 */
	public static final int RESPONSE_NOTFOUND = 404;
	
	/**
	 * parameter has error 400
	 */
	public static final int RESPONSE_PARAMERROR = 400;
	
	/**
	 * system has error 500
	 */
	public static final int RESPONSE_SYSTEMERROR = 500;
	
	/**
	 * method not allow 405
	 */
	public static final int RESPONSE_METHODERROR = 405;
	
	//===============================json-format=====================================
	
	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	public static final String FORMATDATE = "yyyy-MM-dd hh:mm:ss";
	
	//===============================aspect=====================================
	
	/**
	 * CLASS_METHOD : {}.{} ARGS : {} SPEND TIME : {}ms
	 */
	public static final String SERVICEINFO = " CLASS_METHOD : {}.{} ARGS : {} SPEND TIME : {}ms";
	/**
	 * unknown
	 */
	public static final String UNKNOWN = "unknown";
	/**
	 * API_INTERFACE
	 */
	public static final String APPNAMEDEFAULT = "API_INTERFACE";
	/**
	 * app_name
	 */
	public static final String APP_NAME = "app_name";
	/**
	 * api_name
	 */
	public static final String API_NAME = "api_name";
	/**
	 * call_time
	 */
	public static final String CALL_TIEME = "call_time";
	/**
	 * error_code
	 */
	public static final String ERROR_CODE = "error_code";
	/**
	 * error_code_alias
	 */
	public static final String ERROR_CODE_ALIAS = "error_code_alias";
	/**
	 * response_time
	 */
	public static final String RESPONSE_TIME = "response_time";
	/**
	 * dimension
	 */
	public static final String DIMENSION = "dimension";
	/**
	 * error code default -1
	 */
	public static final int ERRORCODEDEFAULT = 0;
	/**
	 * response time default 0
	 */
	public static final long RESPONSETIMEDEFAULT = 0;
	/**
	 * error
	 */
	public static final String ERRORNAME = "error";
	/**
	 * errorCode
	 */
	public static final String ERRORCODE = "errorCode";
	/**
	 * errorDesc
	 */
	public static final String ERRORDESC = "errorDesc";
	/**
	 * success
	 */
	public static final String SUCCESS = "success";
	/**
	 * begin_nao_time
	 */
	public static final String BEGIN_NAO_TIME = "begin_nao_time";
	/**
	 * message
	 */
	public static final String MESSAGE = "message";
}
