package utils;

import java.util.HashSet;
import java.util.Set;

/**
 * About: 常量类
 * Other:
 * Created: Chenhao on 2016/6/27 11:06.
 * Editored: xuefenng jiang  on 16/6/28  20:27 增加TSS的数据同步类型定义
 * jyhuang 添加角色、任务相关类型定义
 * liyw 2016-09二期优化整理
 * 徐家庆 2016-10-20添加特殊字符常量
 */
public class Constants {
    public static final String PRIVATE_KEY = "30820277020100300d06092a864886f70d0101010500048202613082025d02010002818100df1e8d40eb9d5ae84fb90889abc2362d73b8931bbe4e0affe8addfc2b11d1164e4890e1c7e36edd88389e02b5f92a2f447a0f0a6575c18e3f0504061f1242d1c5e188fb67c923ff23ad05bc28370b35dee9b21dfb546820ef1d77329968e76001621ec8e5fbafd49a244a46909a6dd2a94512efd32a65b2c835d241a0f83e88d020301000102818100b1b0a22bfeb8ddaa3fbb8baa2088d61ed2973f490c01194f7f1de2232a6c8ceabdfaccab32754a6c712d7fc2eb255bf3918c01bb67bd67f137f4a1a19eab01e4a52fea878e95dfcfd34449fb0a909cbdf6b40be46865b13276f41fdb41822ddce6fd4baf6e05710eac6f2fcefa4b526d518c802d321f9d10042a037b1ea408a1024100fef35dc726564593f5c3bed50fdf04ea367cf79c764e82be99132029668871b9fbe8eda4ce9511e8733236a540a70a05b189fec7fe8fb821da84d1dd55786945024100e009a551d882af47f13e7ac879d08e35a051c069ce8122775fc364aa8d3806632f24153d9e49f5c702f2cd0bc88465212b0719a3187d59517d5cf868a27262a9024100f7843a853ff8fdefd9e8427b03bf973bf3ce7b6e91854375db932fe441c131f84853297499832c31aab5134c786a3356b7b8ab7c6aee08ec050471e31a399ea902405de1cce4424d69344594c0111872dbd4ff0ca30bf39c4b9c288611be2295729fc796604c44f38b49cd237fe74b2ca7d0415ea550a2278cf1480e588e485c949902400da2448d9b2be72d7873930ac50a7542a296e1bdf696f47991861bde5a6f8412f6fa06f2146c88f3f4b707d9671fe4b6bf7c780617fbe9f1c5ffa4343ce9db0f";
    public static String DB_ENTER = "<br>";

    /**
     * 文件目录 定义 BEGIN ！！！不允许修改！！！
     **/
    //返回目录map包含以下key
    public static int RELATIVE_PATH = 1;//相对路径目录（String）
    public static int ABSOLUTELY_PATH = 2;//绝对路径目录（String）
    public static int STATIC_FILE_PATH = 3;//静态文件访问路径（String）
    public static int STATIC_FILE_PRE_PATH = 4;//静态路径访问前缀（String）
    public static int ABSOLUTELY_PRE_PATH = 5;//绝对路径目录前缀（String）
    public static int CONTENTS_FILE_PATH = 6;//内容文件访问路径（String）
    public static int CONTENTS_FILE_PRE_PATH = 7;//内容路径访问前缀（String）
    //map传入参数可选key
    public static String PARAM_KEY_ID = "id";//主键（String）
    public static String PARAM_KEY_APVID = "apvId";//版本主键（String）
    public static String PARAM_KEY_FILENAME = "fileName";//文件名（String）
    public static String PARAM_KEY_RELATIVE_PATH = "relativePath";//相对路径（String）
    public static String PARAM_KEY_IS_CREATEDIR = "isCreateDir";//是否自动创建目录(true、false)
    public static String PARAM_KEY_RESOURCE = "resource";//资源目录（String）
    //特殊字符常量
    public static String STRING_NULL = ""; //空字符
    public static String STRING_RIGHT = "☑"; //勾选框
    public static String STRING_WRONG = "□"; //未选中的框

    //Constants.PARAM_KEY_RESOURCE 包含以下类型 begin
    //目录资源类型
    public static String APP_ICO_DIR = "ico";//应用图标目录
    public static String APP_RESOURCE_DIR = "resources";//应用资源目录(目前仅限图片)
    public static String ADV_RESOURCE_DIR = "resources";//广告资源目录(图片、视频)
    public static String IMPORT_TEMP_DIR = "importTemp";//临时导入目录
    public static String EXPORT_TEMP_DIR = "exportTemp";//临时导出目录
    public static String LOGO_TEMP_DIR = "logoTemp";//临时logo目录
    public static String INDEXPIC_TEMP_DIR = "indexPicTemp";//开发者主页临时目录
    public static String HEADICO_DIR = "headIco";//头像目录
    public static String IDIMG_DIR = "IDImg";//身份证目录
    public static String COMIMG_DIR = "comImg";//企业营业执照目录
    public static String COMFILE_DIR = "comFile";//企业信息目录
    public static String LOGOICO_DIR = "logoIco";//logo目录
    public static String TEMPLATE_DIR = "template";//模版目录
    public static String INDEX_DIR = "indexFolder";//资源图片目录
    public static String IMGICO_DIR="imgIco";//图片目录
    public static String PROTOCOL_PRICE_DIR="priceFile";//定价协议
    public static String PROTOCOL_OTHER_DIR="otherFile";//其他协议
    public static String PROTOCOL_PRICE_AGREE_DIR="priceAgreeFile";//定价认可协议
    public static String PROTOCOL_OTHER_AGREE_DIR="otherAgreeFile";//其他认可协议
    public static String PROTOCOL_SHARE_AGREE_DIR="shareAgreeFile";//分润认可协议
    public static String APK_SPLITPACKNAME_DIR = "splitPackName";//拆分包目录
    public static String APK_SIGN_PUBLIC = "public";//公共签名目录
    //下载资源类型
    public static String DOWNLOAD_RES_POS_TEMPLATE = "posTemplate.xls";//终端导入模版
    public static String DOWNLOAD_RES_POSKSN_TEMPLATE = "posKsnTemplate.xls";//终端KSN导入模版
    public static String DOWNLOAD_RES_POS_RELATION_TEMPLATE = "posRelationTemplate.xls";//终端关联模版
    public static String DOWNLOAD_RES_MER_TEMPLATE = "merTemplate.xls";//商户信息模版
    public static String DOWNLOAD_RES_AGENCY_TEMPLATE = "agencyTemplate.xls";//机构导入模版
    public static String DOWNLOAD_RES_PWDCTL_TEMPLATE = "PowerEnterUMS.exe";//密码控件下载模版
    public static String DOWNLOAD_COMINFO_TEMPLATE = "comInfo.ftl"; //企业信息模板
    public static String DOWNLOAD_RES_POSINIT_TEMPLATE = "posInitTemplate.xls";//终端进件导入模版
    public static String DOWNLOAD_RES_BOOTANIMRES_DEMO = "bootanimresDemo.zip";//开机动画模版
    //Constants.PARAM_KEY_RESOURCE 包含以上类型 end
    /**
     * 文件目录 定义 END
     **/

    //保存用户session
    public static final String SESSION_USER = "session_user";
    public static final String LOGIN_ERROR_MSG = "login_error_msg";
    public static final String LOGIN_STATUS_NOTLOGIN = "0";
    public static final String SESSION_USER_MEAID = "session_user_meaid";
    public static final String SESSION_AREA = "locale";//国际化标示
    public static final String SESSION_PRO_DEF_COMID = "session_pro_def_comid";
    //是否查询历史表
    public static final String SEARCH_FROM_HISTORY = "1";

    public static final int TIMEOUT = 1000 * 60 * 3;//设置验证码的有效时间 3分钟
    public static final String ACCOUNT_KEY = "account";
    public static final String ACCOUNT_TIME_KEY = "accountTime";

    //用户默认密码
    public static final String USER_DEFAULT_PASSWORD = "888888";
    //重置密码
    public static final String RESET_PASSWORD = "123456";

    //终端标签类型
    public static final String LABMARK_DEFAULT_COLOR = "grey";

    //APP文件同步类型定义
    public static final String APP_FTP_VERSION = "01"; //接口版本
    public static final String APP_FTP_TYPE = "01"; //业务类型
    public static final String APP_FTP_RES_SUCCESS = "00"; //成功
    public static final String APP_FTP_RES_EXCEPTION = "99"; //异常


    //字典表默认密码标识
    public static final String BACNO_DEFAULT_PASSWORD = "0010";

    public static final String BACNO_ANDROIDVERSION = "0003";// 安卓系统版本
    public static final String BACNO_PAYCYCLE = "0020";// 付费周期设置

    //开发者账户审批用户设置
    public static final String AUDIT_DEV_USER = "0018";
    //应用审核用户设置
    public static final String AUDIT_APP_USER = "0019";
    //系统版本设置
    public static final String ANDROID_VERSION = "0003";
    //提醒开关
    public static final String NOTICE_ISOPEN_SET = "0022";
    //移机基准距离
    public static final String BACNO_REFDISTANCE = "0028";
    //终端通讯参数
    public static final String BACNO_TMS_PARAMS = "0029";
    //应用权限设置
    public static final String BACNO_SIGN_AUTH = "0030";
    //镜像点设置
    public static final String BACNO_SIGN_ISO = "0031";
    //产权方功能配置
    public static final String BACNO_PRODFUNC_CONFIG = "0034";
    //策略配置
    public static final String BACNO_PUSH_TACTICS = "0035";
    //签名默认配置
    public static final String BACNO_APP_SIGN = "0036";
    //应用自签名配置
    public static final String BACNO_APP_SELF_SIGN = "0037";
    //第三方系统用户注册配置
    public static final String BACNO_OTHER_SYS_REGISTER = "0038";
    //自动审核通过设置
    public static final String BACNO_APPCHECK_AUTOPASS = "0039";
    //联商云服应用排序
    public static final String BACNO_CLOUD_APP_SORT = "0040";
    //渠道包名配置
    public static final String MER_REGISTER_TYPE = "0041";
    //远程协助配置
    public static final String REMOTEHELP_SERVER_PARAM = "0042";
    //服务入口配置
    public static final String SERVICE_ENTRY = "0043";

    //权限生效标志
    public static final Integer AUTHORITY_USABLE = 1;

    //系统设置-运营商机构
    public static final String BACNO_TYP_ISP = "0011";

    //系统设置上传文件类型及大小限制配置编号
    public static final String FILE_TYPE_SIZE = "0004";

    //推送服务相关
    public static final int PUSH_ON = 1;//推送服务开启
    public static final String PUSH_TYPE_POLL = "0101";//消息类型-触发轮询
    //dgms 相关推送
    public static final String DGMS = "dgms";
    public static final String DGMS_PUSH_TYPE_PARAMETER_ISSUANCE = "0101";//消息类型-数据采集参数下发
    public static final String DGMS_PUSH_TYPE_CONTROL_AUTHORITY = "0102";//消息类型-第三方APP控制列表下发
    public static final String DGMS_PUSH_TYPE_SEND_DATA = "0103";//消息类型-第三方APP数据采集

    //运营商启用标致
    public static final int ISP_YES = 1;
    public static final int ISP_NO = 0;

    //操作日志结果
    public static final int USERLOG_SUCC = 1;
    public static final int USERLOG_FAIL = 2;
    //按照年/月查询终端情况(0 年 / 1 月 / 2 日)
    public static final  String RANGEDROP_YEARS = "0";
    public static final  String RANGEDROP_MONTH = "1";
    public static final  String RANGEDROP_DADS = "2";
    //解绑终端和商户操作结果( 1 操作成功)
    public static  final int DISBINDPOS_SUCC=1;
    //绑定商户和终端操作结果（1 操作成功   0 操作失败）
    public static  final int BINDPOS_SUCC=1;
    public static  final int BINDPOS_FAIL=0;
    //数据库增删改操作结果（大于0成功）
    public static final int CRUD_TAG=0;
    //任务项依赖关系解除
    public static final String TASK_REFER_CANCEL = "0";
    //不能注销商户默认用户
    public static final int DEFAULT_USER=99999;

    //按勾选操作
    public static final int OPER_BY_CHOOSE = 1;
    public static final int OPER_BY_CONDITION = 2;

    //提交订单的数据来源
    public static final String SUBMIT_ORDER_FROM_CART = "1";//购物车购买
    public static final String SUBMIT_ORDER_FROM_DIRECT = "2";//直接购买

    //应用统计
    public static final Integer SAPTYPE_DOWNLOAD = 1; //下载量统计
    public static final Integer SAPTYPE_FLOW = 2; //流量统计
    public static final Integer SAPTYPE_USE = 3; //使用量统计
    public static final Integer SAPTYPE_INSTALL = 4; //安装量统计

    //删除应用
    public static final Integer DELETE_APP = 1;//删除应用
    public static final Integer DELETE_NEW_APPVERSION = 2;//删除最新版本

    //应用提交类型
    public static final String NEW_APP_OPERATYPE = "1";//新应用提交
    public static final String UPDATE_APP_OPERATYPE = "2";//修改应用提交
    public static final String NEW_APPVESION_OPERATYPE = "3";//新版本提交
    public static final String UPDATE_APPVESION_OPERATYPE = "4";//修改版本提交

    //应用权限列表分类
    public static final Integer EFFECT_APP_AUTH = 1;//生效权限
    public static final Integer CHECK_APP_AUTH = 2;//审核权限

    //应用权限相关
    public static String URL = "http://127.0.0.1:8090/pts/thridService";
    public static String JAR_CONSTANTS_PATH="d:/stws/fs/src/main/java/com/landi/common/Constants.java";
    public static String JAR_SOURCE_PATH="d:/stws/fs/src/main/java/";
    public static String JAR_CLASS_PATH="d:/stws/fs/target/classes/";

    /**
     * 签名相关
     */
    public enum sign {
        SIGN_SUCCESS(0),//签名成功
        SIGN_FAIL(1),//签名失败
        SIGN_HAS_SIGN(2),//已签名
        UN_SIGN(1),//未签名
        ROOTCRT_APPLYING(0),//根证书申请中
        ROOTCRT_IMPORT(1),//根证书已导入
        WORKCRT_WAIT_APPLY(0),//工作证书待生成
        WORKCRT_APPLY(1);//工作证书已生成
        private final int value;
        sign(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }

    /**
     * 产权方功能配置
     */
    public enum prodFunc{
        ATOM_TASK_OPEN(1),
        ATOM_TASK_CLOSE(0),
        SIGN_ONLY_OPEN(1),
        SIGN_AUTO_SIGN(2),
        SIGN_CLOSE(0);
        private final int value;
        prodFunc(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }

    /**
     * 终端推送相关状态
     * 推送类型：1：指令推送  2：广告推送
     * 推送状态：0：待推送 1：推送成功 2：推送失败
     * 执行状态：0：待执行 1：执行中 2：执行成功 3：执行失败
     * 推送状态标志：1：正常 2：终止并删除（针对已下载广告的终端）  3：终止不删除（针对已下载广告的终端）
     * 记录标志： 0：正常 1：临时添加 2：临时删除
     */
    public enum PushPos {
        PUSH_TYPE_ORDER(1),
        PUSH_TYPE_ADV(2),

        PUSH_STATUS_WILL(0),
        PUSH_STATUS_SUCC(1),
        PUSH_STATUS_FAIL(2),

        DO_STATUS_WILL(0),
        DO_STATUS_DOING(1),
        DO_STATUS_SUCC(2),
        DO_STATUS_FAIL(3),

        PUSH_TEMP_NORMAL(0),
        PUSH_TEMP_ADD(1),
        PUSH_TEMP_DEL(2),


        PUSH_END_NORMAL(1),
        PUSH_END_DEL(2),
        PUSH_END_NOTDEL(3);

        private final int value;

        PushPos(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    /**
     * 动画终端相关状态
     * 执行结果 0-待更新 1-更新完成 2-更新失败
     * 临时修改标志(0正常 1添加 2删除)
     */
    public enum BootPos {
        DO_STATUS_WAIT(0),
        DO_STATUS_SUCC(1),
        DO_STATUS_FAIL(2),

        PUSH_TEMP_NORMAL(0),
        PUSH_TEMP_ADD(1),
        PUSH_TEMP_DEL(2);

        private final int value;

        BootPos(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    /**
     * 钥证书/多方签名管理文件任务表相关状态
     */
    public enum certTask {
        TYPE_CERT(1),
        TYPE_SIGNMANAGER(2),
        MANAGER_OPT_PRODUCT_YES(1),//产权方验证1-是
        MANAGER_OPT_PRODUCT_NO(0),//产权方验证0-否
        MANAGER_OPT_BANK_YES(1),//收单方验证0-否
        MANAGER_OPT_BANK_NO(0),//收单方验证0-否
        CT_MARK_NORMAL(0),
        CT_MARK_UNABLE(1);

        private final int value;
        certTask(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    /**
     * 证书推送相关状态
     * 推送类型：（1：公钥证书下发  2：多方签名管理文件下发）
     * 推送状态：0：待推送 1：推送成功 2：推送失败
     * 执行状态：0：待执行 1：执行中 2：执行成功 3：执行失败
     */
    public enum certTaskPos {
        PUSH_TYPE_CERT(1),
        PUSH_TYPE_SIGNMANAGER(2),

        PUSH_STATUS_WILL(0),
        PUSH_STATUS_SUCC(1),
        PUSH_STATUS_FAIL(2),

        DO_STATUS_WILL(0),
        DO_STATUS_DOING(1),
        DO_STATUS_SUCC(2),
        DO_STATUS_FAIL(3),

        CTP_TMPUPDATE_NORMAL(0),//临时更新标志 正常
        CTP_TMPUPDATE_ADD(1),//临时添加
        CTP_TMPUPDATE_DELETE(2);//临时删除
        private final int value;

        certTaskPos(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }


    /**
     * 广告
     *资源类型（1：文字  2：图片 3：视频）
     * 广告类型（1：屏保广告  2：消息广告）
     */
    public enum Adv {
        ADV_TYPE_TEXT(1),
        ADV_TYPE_PIC(2),
        ADV_TYPE_VIDEO(3),

        ADV_POSTYPE_SCREEN(1),//广告类型
        ADV_POSTYPE_MESSAGE(2),



        ADV_POS_SCREEN(1),
        ADV_POS_ROLL(2),
        ADV_POS_BOOT(3);

        private final int value;
        Adv(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }

    /**
     * 广告目录定义
     */
    public enum AdvDir {
        ADV_DIR_SCREEN("screen"),
        ADV_DIR_ROLL("roll"),
        ADV_DIR_BOOT("boot");

        private final String value;
        AdvDir(String value) {
            this.value = value;
        }
        public String getValue() {
            return this.value;
        }
    }
    /**
     * 推送任务
     */
    public enum PushTask {
        PUSH_MARK_NORMAL(1),// 正常
        PUSH_MARK_STOPDEL(2),// 终止并删除
        PUSH_MARK_STOPNOTDEL(3),// 终止不删除
        PUSH_TYPE_ORDER(1),//  指令推送
        PUSH_TYPE_ADVERT(2);//广告推送

        private final int value;

        PushTask(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    /**
     * add by jyhuang 20160715 添加终端任务上送结果应答码
     */
    public enum TaskResult {
        WAITING_NOTICE("0"),//待通知
        ALREADY_NOTICE("T01"),//已通知
        DOWNLOAD_ING("A01"),//下载中
        DOWNLOAD_STOP("A02"),//下载暂停
        DOWNLOAD_DONE("A03"),//下载完成
        DOWNLOAD_FAIL("A04"),//下载失败
        WAITING_INSTALL("B01"),//待安装
        INSTALL_ING("B02"),//安装中
        INSTALL_DONE("B03"),//安装完成
        INSTALL_FAIL("B04"),//安装失败
        WAITING_UPDATE("C01"),//待更新
        UPDATE_ING("C02"),//更新中
        UPDATE_DONE("C03"),//更新完成
        UPDATE_FAIL("C04"),//更新失败
        UNINSTAILL_ING("D01"),//卸载中
        UNINSTALL_DONE("D02"),//卸载完成
        UNINSTALL_FAIL("D03"),//卸载失败
        TASK_CANCEL("E01"),//任务已取消
        DEPEND_TASK_FAIL("E02"),//依赖任务执行失败
        TASK_FILE_PRO_FAIL("E03"),//任务文件生成失败
        SYSTEM_ERROR("E04"),//服务器处理异常
        TASK_FAIL("E05"),//任务失败
        TASK_FINISH("F01");//任务完成
        private final String state;

        TaskResult(String state) {
            this.state = state;
        }

        public String getState() {
            return this.state;
        }
    }

    /**
     * add by huangjj 20160719 开发者主页
     */
    public enum DevHomePage {
        HOMEPAGE_SLICK("5001"),// 主页幻灯片
        HOMEPAGE_CONTENT("5003");// 主页内容

        private final String value;

        DevHomePage(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    /**
     * add by huangjj 20160722 开发资料文件类型
     */
    public enum ApiFileType {
        APIFILE_SOFTWARE("0"),// 软件工具
        APIFILE_DOCFILE("1"),// 文档文件
        APIFILE_TEMPLATEFILE("2"),// 范例程序
        APIFILE_PROGRAMFILE("3");// 程序文件

        private final String value;

        ApiFileType(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    //默认导入机构
    public static String DEFAULT_BASICCONFI_AGEID = "0001";
    //任务分配策略基本策略ID
    public static String DEFAULT_TASK_TACTICS = "0001";

    //版本是否最新标志
    public static Integer APV_ISNEW = 2;

    //默认商户终端标签样式
    public final static String MLA_COLOR_DEFAULT = "red";

    //默认版本参数
    public final static String APV_PARAMS_DEFFAULT = "apvTemplateDef";

    /**
     * 商户自定义权限-开
     */
    public final static int MER_COMP_OPEN = 1;

    /**
     * 商户自定义权限-关
     */
    public final static int MER_COMP_CLOSE = 0;

    /**
     * 终端登录验证-开
     */
    public final static int MER_VALIDATE_OPEN = 1;

    /**
     * 终端登录验证-关
     */
    public final static int MER_VALIDATE_CLOSE = 0;

    //支付模式-永久
    public static final Integer PAY_MODE_FOREVER = 0;

    //永久的过期时间
    public static final String FOREVER_DATE ="2999/12/31";

    //商户终端标签类型
    public static final String MLAMARK_DEFAULT_COLOR = "red";

    //终端操作应用类型
    public static final String INSTALL = "1";//安装
    public static final String UNINSTALL = "2";//卸载

    //添加类型
    public static final String ADD_TYPE_SINGLE = "1";//单个添加
    public static final String ADD_TYPE_BATCH = "2";//批量添加
    public static final String ADD_TYPE_SEARCH = "3";//查询添加

    //终端绑定类型
    public static final String BIND_POS_TYPE_CART = "1";//购物车终端绑定
    public static final String BIND_POS_TYPE_PAY = "2";//已购买应用终端绑定

    //任务项操作类型
    public static final String TASKPOSLIST_OPERTYPE_OS = "04";//任务项操作类型（01 更新应用 02 应用卸载 03 更新参数 04 OS更新）

    public static final int NEED_SEND_SMS = 1;//发送短信开启
    public static final int NO_SENG_SMG = 0;//发送短信关闭

    public static final int smsFromInternet = 1;//使用外网短信接口
    public static final int smsFromInternal = 2;//使用内网短信接口
    public static final int smsFromAliyun = 3;  //使用阿里云短信接口

    public static final int USING_CHECKRESULT_SMS = 1;//开启审核结果短信通知
    public static final int NO_CHECKRESULT_SMS = 0;//关闭审核结果短信通知

    //远程协助redis前缀-主控端
    public static final String  REMOTE_REDIS_MASTER ="master";
    //远程协助redis前缀-被控端
    public static final String  REMOTE_REDIS_POS="pos";

    /**
     * 整理从此处开始  liyw 2016-09-01
     */

    //支付宝交易状态
    public enum alipayTradeStatus {
        WAIT_BUYER_PAY("WAIT_BUYER_PAY"),//交易创建，等待买家付款
        TRADE_CLOSED("TRADE_CLOSED"),//未付款交易超时关闭，或支付完成后全额退款
        TRADE_SUCCESS("TRADE_SUCCESS"),//交易支付成功
        TRADE_FINISHED("TRADE_FINISHED");//交易结束，不可退款
        private final String value;

        alipayTradeStatus(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }


    // 购物车清单
    public enum shoppingList  {
        SPT_MARK_UNABLE(0),//生效标志 未启用
        SPT_MARK_NORMAL(1),//已启用
        SPT_MARK_DISABLE(2),//禁用
        IF_CAN_BUY_NO(0),//app是否能购买-不能
        IF_CAN_BUY_YES(1),//app是否能购买-能买
        CLEAR_ALL(1),//清空购物车
        CLEAR_OVERDUE(2);//清空过期应用

        private final int value;
        shoppingList(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }

    /**
     * 用户部分
     */
    // 账户系统对应表 生效标志
    public enum userSystem {
        USERMARK_UNABLE(0),//未启用
        USERMARK_NORMAL(1),//已启用
        USERMARK_CANCEL(2),//注销
        USERMARK_AUDIT_PASSING(3),//审核中
        USERMARK_AUDIT_NO_PASS(4);//审核不通过
        private final int state;
        userSystem(int state) {
            this.state = state;
        }
        public int getState() {
            return this.state;
        }
    }

    //系统ID
    public enum system {
        SYSTEM_PTS("0004"),//终端后台服务pts ->tas
        SYSTEM_JBS("0005"),//作业运维服务jbs->bps
        SYSTEM_MCGS("0006"),//作业运维服务jbs
        SYSTEM_ITAS("0001"),//运营商管理平台itas
        SYSTEM_MERCH("0002"),//商户系统bsp
        SYSTEM_DEV("0003"),//公众开发者门户dev
        SYSTEM_PORTAL("0007"),//公众门户portal

        SYSTEM_DGMS("0008"),//dgms
        SYSTEM_DGAS("0009"),//dgas
        SYSTEM_RMS("0010"),//rms
        SYSTEM_MWP("0011");//商户公众平台

        private final String value;

        system(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    // 订单表
    public enum appOrder {
        BUY_TYPE_APP(1),//购买类型-app购买
        BUY_TYPE_YEAR(2),//购买类型-年费购买
        ORD_STATUS_NO_PAY(1),//订单状态-待付款
        ORD_STATUS_PAY(2),//订单状态-已付款
        ORD_STATUS_CANCEL(3),//订单状态-作废
        ORD_PAYSTATUS_NOPAY(1),//支付状态-待支付
        ORD_PAYSTATUS_PAYING(2),//支付状态-支付中
        ORD_PAYSTATUS_SUCCESS(3),//支付状态-支付成功
        ORD_PAYSTATUS_FAILED(4),//支付状态-支付失败
        ORD_BUYTYPE_POS(1),//购买渠道-终端
        ORD_BUYTYPE_BSP(2),//购买渠道-bsp
        ORD_BUYTYPE_ITAS(3),//购买渠道-itas
        ORD_PAYTYPE_ALIPAY(1);//支付渠道-支付宝

        private final int value;
        appOrder(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }

    //ROLE 角色表
    public enum role {
        ROLE_TYPE_OPERATOR(1),//角色类型   运营商
        ROLE_TYPE_PRODUCT(2),//产权方
        ROLE_TYPE_MERCHANT(3),//商户
        ROLE_TYPE_DEVELOP(4),//开发者
        ROLE_TYPE_PROVIDER(5),//服务提供商
        ROLE_TYPE_ASSISTANT(6),//店员
        ROSTINT_DEL_AND_UPD(0),//角色相关常量   可改可删
        ROSTINT_NODEL_AND_UPD(1),//可改不可删
        ROSTINT_DEL_AND_NOUPD(2),//可删不可改
        ROSTINT_NODEL_AND_NOUPD(3),//不可改不可删除
        RODEF_FALSE(1),//非默认
        RODEF_TRUE(2),//默认
        RODEF_INIT(3),//初始化
        ROLEVEL_NORMAL(1),//常规
        ROLEVEL_MEMBER(2),//成员
        ROLEVEL_COMMON(3);//公共角色

        private final int state;
        role(int state) {
            this.state = state;
        }
        public int getState() {
            return this.state;
        }
    }

    //权限字典 authority
    public enum authority {
        AUTHORITY_TYPE_OPERATOR(1),//角色类型   运营商
        AUTHORITY_TYPE_PRODUCT(2),//产权方
        AUTHORITY_TYPE_MERCHANT(3),//商户
        AUTHORITY_TYPE_DEVELOP(4),//开发者
        AUTHORITY_TYPE_PROVIDER(5),//服务提供商
        AUTHORITY_UNABLE(0),//未启用
        AUTHORITY_NORMAL(1),//启用
        AUTHORITY_CANCEL(2);//注销
        private final int state;

        authority(int state) {
            this.state = state;
        }

        public int getState() {
            return this.state;
        }

    }

    //用户信息 userinfo
    public enum userinfo {
        SEXUAL_MALE(1),//男
        SEXUAL_FEMALE(2);//女
        private final int value;

        userinfo(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

    }

    //企业信息
    public enum comInfor {
        COMDEF_SP(1),//企业来源 1软件服务商注册 3
        COMDEF_PRO_TO_SP(2),//企业来源 2代理商开通服务商
        COMDEF_PRO_DEF(3),//企业来源 3代理商默认
        COMMARK_UNABLE(0),//未启用
        COMMARK_NORMAL(1),//启用
        COMMARK_DISABLED(2);//注销
        private final int value;

        comInfor(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    //用户审核表
    public enum userCheck {
        USERCHECK_TYPE_DEVELOPER("b1"),//开发者账户审核
        USERCHECK_TYPE_SERVER("b2"),//服务商账户审核+服务商信息修改
        USERCHECK_TYPE_DEVTOSERVER("b3"),//开发者转服务商
        USERCHECK_RESULT_PASS("1"),//审核通过
        USERCHECK_RESULT_NOPASS("2"),//审核不通过

        USERCHECK_MARK_UNABLE("0"),//未启用
        USERCHECK_MARK_USEABLE("1"),//已启用
        USERCHECK_MARK_DISABLE("2");//禁用
        private final String value;

        userCheck(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }


    }

    //审核状态流水表
    public enum userCheckState {
        USER_VISIT(1),//管理员 查看
        USER_CHECK(0),//审核人 处理流程
        UCSTYPE_USER(1),//1 用户审核
        UCSTYPE_APP(2),//2 应用审核
        UCSTYPE_APP_KEY(3),//3 应用权限审核
        UCSTYPE_TEST_MACHINE(4);//4 样机申请审核
        private final int value;

        userCheckState (int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }


    }

    //机构
    public enum agency {
        AGENCY_USE_PUBLICCERT_YES(1),//是否使用公共证书-是
        AGENCY_USE_PUBLICCERT_NO(2),//是否使用公共证书-否
        AGENCY_TYPE_BRANCH(1),//单位
        AGENCY_TYPE_DEPT(2),//部门
        AGENCY_NORMAL(0),//正常
        AGENCY_OPERATOR(1);//运营商机构
        private final int value;

        agency(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

    }

    //系统通知表
    public enum sysNotice{
        SSNTYPE_MER(2),//通知到用户
        SSNTYPE_SYS(1),//通知到系统
        SSNSHOW_LONG(1),//长挂
        SSNSHOW_ONCE(2),//只显示一次
        SSNUPDATE_NORAML(0),//临时修改标志 正常
        SSNUPDATE_ADD(1),//临时修改标志 添加
        SSNUPDATE_DEL(2),//临时修改标志 删除
        SSNMARK_UNABLE(0),//生效标志 未启用
        SSNMARK_NORMAL(1),//已启用
        SSNMARK_DISABLE(2),//禁用
        SSNTYPE_COMINFOR(1);//企业认证
        private final int value;

        sysNotice(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

    }
    //    通知中间表
    public enum sysNoticeMid{
        SNMUPDATE_NORAML(0),//临时修改标志 正常
        SNMUPDATE_ADD(1),//临时修改标志 添加
        SNMUPDATE_DEL(2),//临时修改标志 删除
        SNMSTATE_UNREAD(0),//未查看
        SNMSTATE_READ(1);//已阅
        private final int value;
        sysNoticeMid(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }

    // 数据配置
    public enum pubcerInfo {
        PUBCERINFO_CODE_SUCC(0),//计算hash成功
        PUBCERINFO_CODE_FAIL(1),//计算hash失败
        PUBCERINFO_SIGN(1),//动态库标识-授权标识
        PUBCERINFO_UN_SIGN(2),//动态库标识-撤销授权
        PUBCERINFO_TYPE_MASTER(1),//主方类型
        PUBCERINFO_TYPE_SLAVE(2);//从方类型
        private final int value;

        pubcerInfo(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

    }

    // kapnum
    public enum kapnum {
        //使用标识(0:未使用 1:已使用)
        KAPNUM_FLAG_ONUSE(1),
        KAPNUM_FLAG_USELESS(0);
        private final int value;

        kapnum(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

    }

    /**
     * 商户
     */
    public enum merchants {
        MER_COMP_CLOSE(0),//商户自定义权限关闭
        MER_COMP_OPEN(1),//权限开启
        MER_VALIDATE_CLOSE(0),//pos匹配验证关闭
        MER_VALIDATE_OPEN(1),//pos匹配验证开启
        MERMARK_UNABLE(0),//生效标志 未启用
        MERMARK_NORMAL(1),//已启用
        MERMARK_DISABLE(2);//禁用
        private final int value;

        merchants(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    /**
     * 终端
     */
    //终端与标签对应表
    public enum posLabelMid {
        PLMMARK_UNABLE(0),//生效标志 未启用
        PLMMARK_NORMAL(1),//已启用
        PLMMARK_DISABLE(2);//禁用
        private final int value;

        posLabelMid(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    //终端标签
    public enum posLabel {
        POSLABLE_TYPE_DEFAULT(0),//终端标签类型 默认
        POSLABLE_TYPE_CUSTOM(1),//自定义

        POSLABLE_UNABLE(0),//生效标志 未启用
        POSLABLE_NORMAL(1),//已启用
        POSLABLE_DISABLE(2);//禁用
        private final int value;

        posLabel(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }


    //终端信息
    public enum pos {
        POS_OUTLINE(0),//终端在线状态  离线
        POS_ONLINE(1),//在线
        POS_LOGIN(2),//登录
        POS_STATUS_ABNORMAL(0),//状态-异常
        POS_STATUS_NORMAL(1),//状态-正常
        POS_TEST_YES(1),//是否测试终端-是
        POS_TEST_NO(0),//是否测试终端-否
        POSMARK_UNABLE(0),//生效标志 未启用
        POSMARK_NORMAL(1),//已启用
        POSMARK_DISABLE(2),//禁用
        POS_ENABLE_NO(0),//未初始化
        POS_ENABLE_YES(1);//已初始化
        private final int value;

        pos(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

    }

    //终端应用表 终端交互协议0209
    public enum posAppInstall {
        PAI_FROM_TMS("1"),//下载来源-tms
        PAI_FROM_STORE("2"),//下载来源 -应用市场
        PAI_DOWNLOAD_ING("A01"),//下载中
        PAI_DOWNLOAD_STOP("A02"),//下载暂停
        PAI_DOWNLOAD_DONE("A03"),//下载完成
        PAI_DOWNLOAD_FAIL("A04"),//下载失败
        PAI_DOWNLOAD_CANCEL("A05"),//下载取消
        PAI_WAITING_INSTALL("B01"),//待安装
        PAI_INSTALL_ING("B02"),//安装中
        PAI_INSTALL_DONE("B03"),//安装完成
        PAI_INSTALL_FAIL("B04"),//安装失败
        PAI_WAITING_UPDATE("C01"),//待安装更新
        PAI_UPDATE_ING("C02"),//更新安装中
        PAI_UPDATE_DONE("C03"),//更新安装完成
        PAI_UPDATE_FAIL("C04"),//更新安装失败
        PAI_UNINSTAILL_ING("D01"),//卸载中
        PAI_UNINSTALL_DONE("D02"),//卸载完成
        PAI_UNINSTALL_FAIL("D03"),//卸载失败
        PAI_TASK_CANCEL("E01"),//任务已取消
        PAI_DEPEND_TASK_FAIL("E02"),//依赖任务执行失败
        PAI_TASK_FILE_PRO_FAIL("E03"),//任务文件生成失败
        PAI_SYSTEM_ERROR("E04"),//服务器处理异常
        PAI_TASK_FINISH("F01");//任务完成
        private final String state;

        posAppInstall(String state) {
            this.state = state;
        }

        public String getState() {
            return this.state;
        }
    }

    //商户终端标签 需要转换类型
    public enum posMerLable {
        MLA_TYPE_DEFAULT("0"),//终端标签类型 默认
        MLA_TYPE_CUSTOM("1"),//自定义
        MLA_NAME_DEFAULT("默认标签"),//默认标签名
        MLA_COLOR_DEFAULT("red"),//默认标签颜色
        MLAMARK_UNABLE("0"),//商户终端生效标志 未启用
        MLAMARK_NORMAL("1"),//已启用
        MLAMARK_DISABLE("2");//禁用
        private final String value;

        posMerLable(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    //终端与商户标签对应表
    public enum posMerLabelMid {
        PLMMARK_UNABLE(0),//商户标签与终端对应表生效标志 未启用
        PMLMARK_NORMAL(1),//已启用
        PLMMARK_DISABLE(2);//禁用
        private final int value;

        posMerLabelMid(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    //交易信息日志
    public enum transLog {
        TRLFLAG_SEARCH(0),//查询
        TRLFLAG_CUSTOMPTION(1),//消费
        TRLFLAG_SALESRETURN(2);//退货
        private final int value;

        transLog(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }


    //终端通讯交互日志  99~91视为未知错误
    public enum posCommLog {
        PCLSTATE_SUCCESS("01"),//成功
        PCLSTATE_NOPOS("90");//无此终端
        private final String state;

        posCommLog(String state) {
            this.state = state;
        }

        public String getState() {
            return this.state;
        }

    }

    //终端在线日志,linfux
    public enum posOnlineLog {
        POS_ONLINE(1),//终端在线
        USER_ONLINE(2);//商户、店员登录
        private final int value;
        posOnlineLog(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }
    //商户机构与商户用户对应表,linfux
    public enum merUserAgenMid {
        MERCH_USER(1),//1商户用户
        MERCH_CLERK(2);//2门店用户
        private final int value;
        merUserAgenMid(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }
    //终端备份表
    public enum posBackup {
        PBKTYPE_BACKUP(1),//备份类型 1备份文件 2日志文件
        PBKTYPE_LOG(2);
        private final int value;
        posBackup(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }
    //终端备份记录表,huangjj
    public enum posBackupLog {
        PBKTYPE_RESTORE(1),//还原任务
        PBKTYPE_LOGSEND(2),//日志上送任务
        PBKTYPE_BACKUP(3),//备份任务

        PBLSTASUS_WAITNOTIFY(0),//待通知
        PBLSTASUS_HAVENOTIFIED(1),//已通知
        PBLSTASUS_DOINGNOW(2),//执行中(下载/上传、安装)
        PBLSTASUS_SUCCEDD(3),//成功
        PBLSTASUS_FAIL(4),//失败
        PBLSTATUS_CANCEL(5),//已取消

        PBLLOG_TYPE_LOGCAT(1),//日志类型 1-logcat

        PBLMARK_UNABLE(0),//生效标志 未启用
        PBLMARK_NORMAL(1),//已启用
        PBLMARK_DISABLE(2),//禁用

        PBLPUSH_WAIT(0),//待推送
        PBLPUSH_SUCCESS(1),//推送成功
        PBLPUSH_FAIL(2),//推送失败

        PBL_TEMUPDATE_NORMAL(0),//临时修改标志(0正常 1添加 2删除)
        PBL_TEMUPDATE_ADD(1),
        PBL_TEMUPDATE_DELETE(2);

        private final int value;
        posBackupLog(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }


    /**
     * 任务
     */
    //任务
    public enum task {
        TASK_TYPE_PRODUCT(1),//任务类型 产权方产生
        TASK_TYPE_MERCHANT(2),//商户产生
        TASK_ATOMTYPE_ATOM(1),//原子任务
        TASK_ATOMTYPE_NOTATOM(0),//非原子任务
        TASK_UNABLE(0),//任务生效标志 未启用
        TASK_NORMAL(1),//已启用
        TASK_DISABLE(2);//禁用
        private final int value;

        task(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    //任务系统OS
    public enum taskOs {
        TASKOS_TYPE_UPDATE("04");//OS更新
        private final String value;

        taskOs(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    //任务应用
    public enum taskApp {
        TASKAPP_TYPE_UPDATE("01"),//应用更新
        TASKAPP_TYPE_UNINSTALL("02");//应用卸载
        private final String value;

        taskApp(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    //任务参数
    public enum taskParameter {
        TKP_TYPE_APPINSTALL("01"),//更新类型 更新应用
        TKP_TYPE_APPUNINSTALL("02"),//更新类型 应用卸载
        TKP_TYPE_PARA("03"),//更新类型 参数更新
        TKP_TYPE_OSUPDATE("04");//更新类型 更新OS
        private final String value;

        taskParameter(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    //任务项列表
    public enum taskPosList {
        TPL_TYPE_APP(1),//任务类型 应用
        TPL_TYPE_PARA(2),//参数
        TPL_TYPE_OS(3),//OS更新
        TPL_STATE_UNDO(1),//任务项执行状态 未执行
        TPL_STATE_DOING(2),//执行中
        TPL_STATE_DONE(3),//执行完成
        TPL_EXC_NOTFORCE(1),//任务项执行状态 1-可选
        TPL_EXC_FORCE(2),//任务项执行状态 2-强制
        TPL_EDITFILD(1),//不可修改标志  其他的所有项都为可修改
        TPL_UNABLE(0),//生效标志 未启用
        TPL_NORMAL(1),//已启用
        TPL_DISABLE(2),//禁用
        TPL_TMPUPDATE_NORMAL(0),//临时更新标志 正常
        TPL_TMPUPDATE_ADD(1),//添加
        TPL_TMPUPDATE_DELETE(2);//删除
        private final int value;

        taskPosList(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }


    //任务终端分配
    public enum taskPosDist {
        TPD_WAITING_NOTICE("0"),//待通知
        TPD_ALREADY_NOTICE("T01"),//已通知
        TPD_DOWNLOAD_ING("A01"),//下载中
        TPD_DOWNLOAD_STOP("A02"),//下载暂停
        TPD_DOWNLOAD_DONE("A03"),//下载完成
        TPD_DOWNLOAD_FAIL("A04"),//下载失败
        TPD_DOWNLOAD_CANCEL("A05"),//下载取消//通过应用市场取消，add by linfux on 2018-08-08
        TPD_WAITING_INSTALL("B01"),//待安装
        TPD_INSTALL_ING("B02"),//安装中
        TPD_INSTALL_DONE("B03"),//安装完成
        TPD_INSTALL_FAIL("B04"),//安装失败
        TPD_WAITING_UPDATE("C01"),//待安装更新
        TPD_UPDATE_ING("C02"),//更新安装中
        TPD_UPDATE_DONE("C03"),//更新安装完成
        TPD_UPDATE_FAIL("C04"),//更新安装失败
        TPD_UNINSTAILL_ING("D01"),//卸载中
        TPD_UNINSTALL_DONE("D02"),//卸载完成
        TPD_UNINSTALL_FAIL("D03"),//卸载失败
        TPD_TASK_CANCEL("E01"),//任务已取消
        TPD_DEPEND_TASK_FAIL("E02"),//依赖任务执行失败
        TPD_TASK_FILE_PRO_FAIL("E03"),//任务文件生成失败
        TPD_SYSTEM_ERROR("E04"),//服务器处理异常
        TPD_TASK_ERROR("E05"),//任务失败
        TPD_UNABLE("0"),//生效标志 未启用 本身为int 需转换
        TPD_NORMAL("1"),//已启用
        TPD_DISABLE("2"),//禁用
        TPD_STATUS_WAIT("1"),//待执行
        TPD_STATUS_DOING("2"),//执行中
        TPD_STATUS_SUCCESS("3"),//成功
        TPD_STATUS_FAIL("4"),//失败
        TPD_PUSHSTATUS_WAIT("0"),//待推送
        TPD_PUSHSTATUS_SUCCESS("1"),//推送成功
        TPD_PUSHSTATUS_FAIL("2"),//推送失败
        TPD_TMPUPDATE_NORMAL("0"),//临时更新标志 正常 本身为int 需转换
        TPD_TMPUPDATE_ADD("1"),//添加
        TPD_TMPUPDATE_DELETE("2");//删除
        private final String state;
        taskPosDist(String state) {
            this.state=state;
        }
        public String getState(){
            return this.state;
        }

    }

    //任务结果(未执行)
    public static final Set<String> OP_TYPE_NOEXC_TYPE = new HashSet<String>(){{
        add(taskPosDist.TPD_WAITING_NOTICE.getState());
        add(taskPosDist.TPD_ALREADY_NOTICE.getState());
    }
    };
    //任务结果(下/卸载/安装过程)
    public static final Set<String> OP_TYPE_EXC_TYPE = new HashSet<String>(){{
        add(taskPosDist.TPD_DOWNLOAD_ING.getState());
        add(taskPosDist.TPD_DOWNLOAD_STOP.getState());
        add(taskPosDist.TPD_DOWNLOAD_DONE.getState());
        add(taskPosDist.TPD_WAITING_INSTALL.getState());
        add(taskPosDist.TPD_INSTALL_ING.getState());
        add(taskPosDist.TPD_WAITING_UPDATE.getState());
        add(taskPosDist.TPD_UPDATE_ING.getState());
        add(taskPosDist.TPD_UNINSTAILL_ING.getState());
    }
    };
    //任务结果(成功)
    public static final Set<String> OP_TYPE_SUCESS_TYPE = new HashSet<String>(){{
        add(taskPosDist.TPD_UNINSTALL_DONE.getState());
        add(taskPosDist.TPD_UPDATE_DONE.getState());
        add(taskPosDist.TPD_INSTALL_DONE.getState());
        add(taskPosDist.TPD_TASK_CANCEL.getState());
    }
    };
    //任务结果(失败)
    public static final Set<String> OP_TYPE_FAIL_TYPE = new HashSet<String>(){{
        add(taskPosDist.TPD_DOWNLOAD_FAIL.getState());
        add(taskPosDist.TPD_INSTALL_FAIL.getState());
        add(taskPosDist.TPD_UPDATE_FAIL.getState());
        add(taskPosDist.TPD_UNINSTALL_FAIL.getState());
        add(taskPosDist.TPD_DEPEND_TASK_FAIL.getState());
        add(taskPosDist.TPD_TASK_FILE_PRO_FAIL.getState());
        add(taskPosDist.TPD_SYSTEM_ERROR.getState());
        add(taskPosDist.TPD_TASK_ERROR.getState());
        add(taskPosDist.TPD_DOWNLOAD_CANCEL.getState());//add by linfux on 2018-08-08
    }
    };

    /**
     * 应用
     */
    //应用分类
    public enum appClass {
        APPCLASS_UNABLE(0),//生效标志 未启用
        APPCLASS_NORMAL(1),//已启用
        APPCLASS_DISABLE(2);//禁用
        private final int value;

        appClass(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }


    //    应用与机构对应表
    public enum appWithMid {
        APW_STATE_NEVERADDED(0),//从未上架
        APW_STATE_ADDED(1),//已上架
        APW_UNABLE(0),//生效标志 未启用
        APW_NORMAL(1),//已启用
        APW_DISABLE(2);//禁用
        private final int value;

        appWithMid(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

    }

    //    应用
    public enum app {
        APP_STATE_DEALING(1),//处理中
        APP_STATE_DEALFAILURE(2),//处理失败
        APP_STATE_COMMIT_NOADDED(3),//提交成功未上架
        APP_STATE_COMMIT_ADDED(4),//提交成功已上架
        APP_BASICTYPE_UNACQUIRER(1),//应用属性-非收单应用
        APP_BASICTYPE_BACKSTAGE(2),//应用属性-后台服务应用
        APP_BASICTYPE_ACQUIRER(3),//应用属性-收单应用
        APP_SIGN_TYPE_LANDI(0),//签名类型-联迪
        APP_SIGN_TYPE_AGENT(1),//签名类型-代理商
        APP_PAYTYPE_FREE(2),//免费应用
        APP_PAYTYPE_PAY(1),//付费应用
        APP_ISINPAY_YES(1),//年费应用
        APP_ISINPAY_NO(0),//非年费应用
        APP_PAYMODE_FOREVER(99),//收费模式 永久
        APP_PAYMODE_ONEMONTH(1),//收费模式 1个月
        APP_PAYMODE_THREEMONTH(3),//收费模式 3个月
        APP_PAYMODE_SIXMONTH(6),//收费模式 6个月
        APP_PAYMODE_TWFMONTH(12),//收费模式 12个月
        APP_INDES_TYPE_YES(1),//行业应用
        APP_INDES_TYPE_NO(2),//非行业应用
        APP_PARAM_TYPE_PAR(1),//参数类型-par
        APP_PARAM_TYPE_XML(2),//参数类型-xml
        APP_PARAM_COMMON(1),//公共参数
        APP_PARAM_PERSONAL(2),//个性化参数
        APP_SHARED_NO(1),//对新增子机构不共享
        APP_SHARED_YES(2),//对新增子机构共享
        APP_SELF_UPGRADE_YES(1),//是否自更新-是
        APP_SELF_UPGRADE_NO(2),//是否自更新-否
        APP_UNABLE(0),//生效标志 未启用
        APP_NORMAL(1),//已启用
        APP_DISABLE(2);//禁用

        private final int value;

        app(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    //    应用资源
    public enum appResources {
        APPRESOURCE_TYPE_COVER(1),//资源分类优先级递减 封面图
        APPRESOURCE_TYPE_PROPAGANDA(2),//宣传图
        APPRESOURCE_TYPE_INTERFACE(3),//界面图
        APPRESOURCE_UNABLE(0),//生效标志 未启用
        APPRESOURCE_NORMAL(1),//已启用
        APPRESOURCE_DISABLE(2);//禁用
        private final int value;

        appResources(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }


    }

    //应用审核表
    public enum appCheck {
        ACK_TYPE_FIRSTCOMMIT("a1"),//新应用提交（原首次提交审核）
        ACK_TYPE_INFOMODEFIED("a2"),//应用修改（应用信息修改审核）
        ACK_TYPE_VERSIONCOMMIT("a3"),//应用版本提交审核
        ACK_TYPE_VERSIONMODIFIED("a4"),//应用版本修改审核 版本信息资源修改，参数修改
        ACK_TYPE_APP_DELETE("a5"),//应用删除审核
        ACK_TYPE_APV_DELETE("a6"),//应用版本删除审核
        ACK_TYPE_APPKEY_ADD("c1"),//APPKEY申请
        ACK_TYPE_APPKEY_UPDATE("c2"),//APPKEY修改
        ACK_TYPE_APPKEY_DELETE("c3"),//APPKEY删除
        ACK_TYPE_TEST_MACHINE_ADD("d1"),//样机申请
        ACK_RESULT_PASS("1"),//审核结果 通过
        ACK_RESULT_NOPASS("2"),//不通过
        ACK_RESULT_SIGN_FAIL("3"),//TPM签名不通过
        ACK_PRO_STATE_SUCC("0"),//流程状态-成功
        ACK_PRO_STATE_FAIL("1"),//流程状态-失败
        ACK_UNABLE("0"),//生效标志 未启用
        ACK_NORMAL("1"),//已启用
        ACK_DISABLE("2");//禁用
        private final String value;

        appCheck(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }


    //    应用版本
    public enum appVersion {
        APPVERSION_DEVEL(1),//版本标识 1 开发版本 2发布版本
        APPVERSION_RELEASE(2),//发布版本
        APPVERSION_REL_ALL_AREA(1),//版本发布区域-全平台
        APPVERSION_REL_ASSIGN_AREA(2),//版本发布区域-指定区域
        APPVERSION_NOT_NEW(1),//最新版本标志 不是最新
        APPVERSION_NEW(2),//是最新
        APPVERSION_APVTEST(1),//灰度
        APPVERSION_APVNORMAL(2),//正常
        APPVERSION_UNABLE(0),//生效标志 未启用
        APPVERSION_NORMAL(1),//已启用
        APPVERSION_DISABLE(2),//禁用
        APPVERSION_TEST_ON(1),//开启灰度
        APPVERSION_TEST_OFF(2);//关闭灰度
        private final int value;

        appVersion(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

    }


    //拆分包表
    public enum splitPack{
        USE_PUBLIC_YES(1),//是否使用公共证书签名-是
        USE_PUBLIC_NO(2),//是否使用公共证书签名-否
        SPLITPACK_APK(1),//拆分包类型 1apk
        SPLITPACK_OS(2);//拆分包类型 2os
        private final int value;
        splitPack(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }



    //    应用上架
    public enum appAdded {
        APPADDED_NOT_NOTICE(0),//上架终端不通知（备用）
        APPADDED_NOTICE(1),//上架终端通知
        APPADDED_NOT_BINDING(0),//不可卸载
        APPADDED_BINDING(1),//可卸载
        APPADDED_NOT_VISIBLE(0),//不可见
        APPADDED_VISIBLE(1),//可见
        APPADDED_NOT_POPULAR(0),//不热门
        APPADDED_POPULAR(1),//热门
        APPADDED_NOT_REMNOTICE(0),//下架不通知
        APPADDED_REMNOTICE(1),//下架通知
        APPADDED_NOT_UNINSTALL(1),//不卸载
        APPADDED_UNINSTALL(0),//卸载
        APPADDED_NOT_READTIME(0),//不实时
        APPADDED_READTIME(1),//实时
        APPADDED_NOT_SHOPAPP(0),//非门店应用
        APPADDED_SHOPAPP(1),//门店应用
        APPADDED_UNABLE(0),//生效标志 未启用
        APPADDED_NORMAL(1),//已启用
        APPADDED_DISABLE(2);//禁用
        private final int value;

        appAdded(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

    }

    //应用型号兼容关系
    public enum appCompModelMid {
        ACMM_UNABLE(0),//生效标志 未启用
        ACMM_NORMAL(1),//已启用
        ACMM_DISABLE(2);//禁用
        private final int value;

        appCompModelMid(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

    }

    //应用市场
    public enum appMarket {
        APPMARKET_TYPE_BASE(0),//市场类型-基础市场
        APPMARKET_TYPE_PERSONAL(1),//市场类型-个性化市场
        APPMARKET_SOFT_DEFAULT(0),//0：轮播图默认排序
        APPMARKET_NOT_NOTICE(0),//上架终端不通知（备用）
        APPMARKET_NOTICE(1),//上架终端通知
        APPMARKET_NOT_BINDING(0),//不可卸载
        APPMARKET_BINDING(1),//可卸载
        APPMARKET_NOT_VISIBLE(0),//不可见
        APPMARKET_VISIBLE(1),//可见
        APPMARKET_NOT_POPULAR(0),//不热门
        APPMARKET_POPULAR(1),//热门
        APPMARKET_NOT_REMNOTICE(0),//下架不通知
        APPMARKET_REMNOTICE(1),//下架通知
        APPMARKET_NOT_UNINSTALL(1),//不卸载
        APPMARKET_UNINSTALL(0),//卸载
        APPMARKET_NOT_READTIME(0),//不实时
        APPMARKET_READTIME(1),//实时
        APPMARKET_NOT_SHOPAPP(0),//非门店应用
        APPMARKET_SHOPAPP(1),//门店应用
        APPMARKET_UNABLE(0),//生效标志 未启用
        APPMARKET_NORMAL(1),//已启用
        APPMARKET_DISABLE(2);//禁用
        private final int value;
        appMarket(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }

    }

    // 应用使用日志
    public enum appUserLog {
        APPMUSERLOG_UNABLE(0),//生效标志 未启用
        APPMUSERLOG_NORMAL(1),//已启用
        APPMUSERLOG_DISABLE(2);//禁用
        private final int value;
        appUserLog(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }

    // 应用市场与终端对应表
    public enum appPosMid {
        APMMARK_UNABLE(0),//启用标志 不启用
        APMMARK_NORMAL(1);//启用
        private final int value;
        appPosMid(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }

    // 应用下载日志
    public enum appDownLog {
        APPDOWNLOG_UNABLE(0),//生效标志 未启用
        APPDOWNLOG_NORMAL(1),//已启用
        APPDOWNLOG_DISABLE(2);//禁用
        private final int value;
        appDownLog(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }

    // 应用参数模板
    public enum appParameter {
        APPPARA_UNABLE(0),//生效标志 未启用
        APPPARA_NORMAL(1),//已启用
        APPRARA_DISABLE(2);//禁用
        private final int value;
        appParameter(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }

    // 应用轮播图
    public enum appRotation {
        ARO_TEMUPDATE_NORMAL(0),//临时修改标志(0正常 1添加 2删除)
        ARO_TEMUPDATE_ADD(1),
        ARO_TEMUPDATE_DELETE(2),
        AROMARK_UNABLE(0),//生效标志 未启用
        AROMARK_NORMAL(1),//已启用
        AROMARK_DISABLE(2);//禁用
        private final int value;
        appRotation(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }
    /*开发资料
     **/

    // 开发资料信息
    public enum informApi {
        INFOAPI_NOT_VISIBLE(0),//资料可见性 不可见
        INFOAPI_VISIBLE(1);//可见
        private final int value;

        informApi(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

    }

    // 开发资料文件信息
    public enum informApiFile {
        APIFILE_SOFTWARE(0),// 软件工具
        APIFILE_DOCFILE(1),// 文档文件
        APIFILE_TEMPLATEFILE(2),// 范例程序
        APIFILE_PROGRAMFILE(3);// 程序文件
        private final int value;
        informApiFile(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }

    }

    /**
     * 统计
     */

    // 应用统计表
    public enum statApp {
        SAPP_DOWNLOAD(1),//下载量统计
        SAPP_FLOW(2),//流量统计
        SAPP_USE(3),//使用量统计
        SAPP_INSTALL(4),//安装统计
        SAPP_GROW(5),//增长统计
        SAPP_FREE(6),//免费个数统计
        SAPP_PAY(7);//收费个数统计
        private final int value;
        statApp(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }

    // 商户统计表
    public enum statMerchants {
        SMER_TYPE_ADD(1),//商户增量统计
        SMER_TYPE_TOTAL(2),//商户总量统计
        SMER_TYPE_LOGOUT(3);//商户注销量统计
        private final int value;
        statMerchants(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }

    // 终端统计表
    public enum statPos {
        SPOS_TYPE_ADD(1),//终端增量统计
        SPOS_TYPE_TOTAL(2),//终端总量统计
        SPOS_FLOW(1),//终端流量统计
        SPOS_TYPE_LOGOUT(3);//终端注销量统计
        private final int value;
        statPos(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }

    // 用户统计表
    public enum statUser {
        SUSER_TYEP_DEV(1),//开发者
        SUSER_TYPE_PROVIDER(2),//服务提供商
        SU_TYPE_NORMAL(1),//统计类型-正常数量
        SU_TYPE_DISABLE(2),//统计类型-注销数量
        SUSER_TYPE_ADD(1),//用户增量统计
        SUSER_TYPE_NUM(2),//用户数量统计
        SUSER_TYPE_CANCEL(3);//用户注销量统计
        private final int value;
        statUser(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }

    // 产权方商户终端统计表
    public enum statAgency {
        STAT_TYPE_MER_NORMAL(1),//正常商户数
        STAT_TYPE_MER_CANCEL(2),//注销商户数
        STAT_TYPE_POS_NORMAL(3),//正常终端数
        STAT_TYPE_POS_CANCEL(4);//正常终端数
        private final int value;
        statAgency(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }

    // 交易统计表
    public enum statTrans {
        STRANS_TYPE_DEAL_ALL(1),//交易总金额
        STRANS_TYPE_COUNT(2),//交易总笔数
        STRANS_TYPE_DEAL_SUCCESS(3);//交易成功笔数
        private final int value;

        statTrans(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    /**
     * 运维
     */
// 数据配置
    public enum basicConfi {
        BASICCON_TYPE_DATA(1),//系统数据配置
        BASICCON_TYPE_SECURe(2),//系统安全配置
        BASICCON_SHOW(1),//可查看
        BASICCON_NOT_SHOW(2);//不可查看
        private final int value;

        basicConfi(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

    }


    //数据字典
    public enum dataDict {
        ITAS_LOGO("0007"),
        DEV_LOGO("0008"),
        DEFAULT_PASSWORD("0010"),//默认密码
        APP_CHECK("0019"),//应用审核人
        ACCOUNT_CHECK("0018");//账户用户审核
        private final String value;
        dataDict(String value) {
            this.value = value;
        }
        public String getValue() {
            return this.value;
        }

    }




    //付费周期 是否默认
    public enum payCycle {
        PAYCYCLE_DEF("1"),//默认
        PAYCYCLE_NODEF("2");//非默认

        private final String value;

        payCycle(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

    }


    // 任务策略
    public enum taskTactics {
        TASKTACTICS_TYPE_NORAML(1),//策略分类 普通
        TASKTACTICS_TYPE_DEFAULT(2),//默认
        TASKTACTICS_TYPE_BASIC(3);//基础
        private final int value;
        taskTactics(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }

    // 作业任务通知表
    public enum jobNotice{
        //通知类型（ 1全新应用  2新上架应用  3 账户审批提醒  4 应用审核提醒 5 appkey审核提醒
        JBNTYPE_NEWAPP(1),
        JBNTYPE_NEWADDED(2),
        JBNTYPE_AUDIT_ACCOUNT(3),
        JBNTYPE_AUDIT_APP(4),
        JBNTYPE_AUDIT_APPKEY(5),
        JBNUSE_NO(0),//未阅读
        JBNUSE_YES(1),//已阅读
        JBN_ISOPEN_YES(1),//提醒开启
        JBN_ISOPEN_NO(2),//提醒关闭
        JBNMARK_UNABLE(0),//生效标志 未启用
        JBNMARK_NORMAL(1),//已启用
        JBNMARK_DISABLE(2);//禁用
        private final int value;
        jobNotice (int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }

    // 操作日志
    public enum userLog {
        SYSID_ITAS("0001"),//  系统主键ID itas系统
        SYSID_MERCH("0002"),//商户系统
        SYSID_DEV("0003"),//开发者系统
        USERLOG_SUCC("1"),//是否异常 正常 本身为int型 需转换
        USERLOG_FAIL("2");//异常
        private final String state;
        userLog(String state) {
            this.state = state;
        }
        public String getState() {
            return this.state;
        }
    }

    // sdk权限
    public enum sdkAuth {
        SDK_TYPE_USER(1),//用户类型
        SDK_TYPE_SYSTEM(2),//系统类型
        SDK_TYPE_ACQ(3);//收单类型
        private final int value;

        sdkAuth(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

    }

    /**
     * 其他类型公共常量
     * */
// 增加 删除 更改 处理关键词
    public enum dealtype{
        TYPE_INSERT("insert"),//增
        TYPE_DELETE("delete"),//删
        TYPE_BATCH("batch"),//批量操作
        TYPE_UPDATE("update");//改
        private final String state;
        dealtype(String state) {
            this.state = state;
        }
        public String getState() {
            return this.state;
        }

    }

    // 处理结果关键词
    public enum results{
        SUCCESS("success"),//增
        FAIL("fail");//改
        private final String state;
        results(String state) {
            this.state = state;
        }
        public String getState() {
            return this.state;
        }

    }


    public static final String RESP_SUCCESS = "success";
    public static final String RESP_FAIL = "fail";

    public static final String RESP_SUCCESS_STATE = "001";
    public static final String RESP_FAIL_STATE = "002";

    //MD5标志
    public enum MD5{
        MD5_TRUE("1"),
        MD5_FALSE("0");
        private final String value;
        MD5(String value) {
            this.value = value;
        }
        public String getValue() {
            return this.value;
        }
    }

    public enum merrole{
        NULLMEAID("1"),//不为空填充字段
        DEFAULT_SORT("roType");//用户角色默认排序字段
        private final String value;
        merrole(String value) {
            this.value = value;
        }
        public String getValue() {
            return this.value;
        }

    }

    public enum appKeyCheck{
        AKC_RESULT_PASS(1),//审核结果 通过
        AKC_RESULT_NOPASS(2),//不通过
        AKC_STATE_COMMON(0),//初审
        AKC_STATE_FINNAL(1),//终审
        AKC_UNABLE(0),//生效标志 未启用
        AKC_NORMAL(1),//已启用
        AKC_DISABLE(2);//禁用
        private final Integer value;
        appKeyCheck(Integer value) {
            this.value = value;
        }
        public Integer getValue() {
            return this.value;
        }
    }
    public enum appKey{
        AKE_UNABLE(0),//生效标志 未启用
        AKE_NORMAL(1),//已启用
        AKE_DISABLE(2),//禁用
        AKE_APP(1),//终端应用权限
        AKE_SYSTEM(2);//系统服务权限
        private final Integer value;
        appKey(Integer value) {
            this.value = value;
        }
        public Integer getValue() {
            return this.value;
        }
    }

    public enum appKeyRole{
        AKR_DEF(1),//默认
        AKR_NODEF(2),//非默认
        AKR_UNABLE(0),//生效标志 未启用
        AKR_NORMAL(1),//已启用
        AKR_DISABLE(2),//禁用
        AKR_TYPE_POS(1),//终端权限
        AKR_TYPE_PLATFORM(2);//平台服务权限
        private final Integer value;
        appKeyRole(Integer value) {
            this.value = value;
        }
        public Integer getValue() {
            return this.value;
        }
    }

    public enum appTestAge{
        ATG_UNABLE(0),//生效标志 未启用
        ATG_NORMAL(1),//已启用
        ATG_DISABLE(2),//禁用
        ATG_TEMUPDATE_NORMAL(0),//临时修改标志(0正常 1添加 2删除)
        ATG_TEMUPDATE_ADD(1),
        ATG_TEMUPDATE_DELETE(2);
        private final Integer value;
        appTestAge(Integer value) {
            this.value = value;
        }
        public Integer getValue() {
            return this.value;
        }
    }

    public enum posPayApps{
        PPASTATE_ACTIVE_NEW(1),//最新激活
        PPASTATE_ACTIVE_EVER(2),//曾经激活
        PPAMARK_UNABLE(0),//生效标志 未启用
        PPAMARK_NORMAL(1),//已启用
        PPAMARK_DISABLE(2);//禁用
        private final Integer value;
        posPayApps(Integer value) {
            this.value = value;
        }
        public Integer getValue() {
            return this.value;
        }
    }

    public enum statAppVersion{
        //(统计类型（1下载量统计、2流量统计、3使用量统计、4安装量统计 5卸载统计）)
        SANTYPE_DOWNLOAD(1),//最新激活
        SANTYPE_FLOW(2),//流量统计
        SANTYPE_USE(3),//使用量统计
        SANTYPE_INSTALL(4),//安装统计
        SANTYPE_UNINSTALL(5);//卸载统计
        private final Integer value;
        statAppVersion(Integer value) {
            this.value = value;
        }
        public Integer getValue() {
            return this.value;
        }
    }

    public enum appPact{
        ACTTYPE_PRICE(1),//协议分类(1定价协议 2其他协议 3分润认可协议 4定价认可协议 5其他认可协议)
        ACTTYPE_OTHER(2),
        ACTTYPE_SHARE_AGREE(3),
        ACTTYPE_PRICE_AGREE(4),
        ACTTYPE_OTHER_AGREE(5),
        ACT_TEMUPDATE_NORMAL(0),//临时修改标志(0正常 1添加 2删除)
        ACT_TEMUPDATE_ADD(1),
        ACT_TEMUPDATE_DELETE(2),
        ACT_TEMFILE_NORMAL(0),//临时文件(0正常文件 1审批中的临时文件)
        ACT_TEMFILE_TEMP(1),
        ACTMARK_UNABLE(0),//生效标志 未启用
        ACTMARK_NORMAL(1),//已启用
        ACTMARK_DISABLE(2);//禁用
        private final Integer value;
        appPact(Integer value) {
            this.value = value;
        }
        public Integer getValue() {
            return this.value;
        }
    }

    /**dev*/

    /**
     * 用于菜单的值
     * */
    public enum Menu {
        INAFLAG("0"),
        INCFLAG("1");
        private final String state;
        Menu(String state) {
            this.state = state;
        }
        public String getState(){
            return this.state;
        }
    }

    /**
     * 用于证件类型的值
     * */
    public enum LogoType {
        IC("IC"),//身份证
        COMFILE("COMFILE"),//企业文件信息
        LICENSE("LICENSE");//营业执照
        private final String state;
        LogoType(String state) {
            this.state = state;
        }
        public String getState(){
            return this.state;
        }
    }

    /**
     * 证件类型
     * */
    public enum LicenseType{
        IC("1"),//身份证
        OTHER("2");//其他
        private final String state;
        LicenseType(String state) {
            this.state = state;
        }
        public String getState(){
            return this.state;
        }
    }

    //开发者/服务提供商审核类型
    public enum AuditType{
        AUDIT_TYPE_DEVELOP(1),
        AUDIT_TYPE_PROVIDER(2);
        private final int state;
        AuditType(int state) {
            this.state = state;
        }
        public int getState() {
            return this.state;
        }
    }
    //终端换机记录
    public enum Poschange{
        PC_STATUS_WAIT(0),
        PC_STATUS_NOTICE(1),
        PC_STATUS_SUCC(3),
        PC_STATUS_FAIL(4);
        private final int state;
        Poschange(int state) {
            this.state = state;
        }
        public int getState() {
            return this.state;
        }
    }

    //帐号允许操作类型
    public enum AccountOper {
        ACCOUNT_OPER_TYPE("operType"),//操作类型map key
        ACCOUNT_OPER_TYPE_REG("register"),//允许注册
        ACCOUNT_OPER_TYPE_ACTIVE("active"),//允许激活
        ACCOUNT_OPER_TYPE_EXIST("exist"),//已存在
        ACCOUNT_OPER_TYPE_NCHANGE("nReplace"),//不能换绑
        ACCOUNT_OPER_TYPE_YCHANGE_YEXIST("yReplaceY"),//能换绑且银商系统存在用户
        ACCOUNT_OPER_TYPE_YCHANGE_NEXIST("yReplaceN");//能换绑且银商系统不存在用户
        private final String value;
        AccountOper(String value) {
            this.value = value;
        }
        public String getValue() {
            return this.value;
        }
    }

    //登录、注册、修改密码、登出
    public enum LoginDataType {
        LOGIN_DATA_TYPE("01"),//登录
        REGISTER_DATA_TYPE("02"),//注册
        PASSWORD_DATA_TYPE("03"),//修改密码
        LOGOUT_DATA_TYPE("04"),//登出
        CAPTCHACODE_DATA_TYPE("05"),//获取验证码
        RESETPASS_DATA_TYPE("06"),//找回密码
        GET_APPSTORE_PARAM("10");//获取appstore参数
        private final String value;
        LoginDataType(String value) {
            this.value = value;
        }
        public String getValue() {
            return this.value;
        }
    }

    //审核流程设置
    //审核流程类型
    public enum rePro {
        a1("新应用提交审核","0001"), a2("应用修改审核","0002"), a3("新版本程序提交审核","0003"), a4("版本程序修改审核","0004"),a5("应用删除","0005"),a6("版本删除","0006"),
        b2("服务提供商注册审核流程","0001"),
        c1("appKey新增申请","0001"),c2("appKey修改申请","0002"),c3("appKey删除申请","0003"),
        d1("样机新增申请","0001");// 成员变量
        private String proName;
        private String proNo;

        // 构造方法
        private rePro(String proName, String proNo) {
            this.proName = proName;
            this.proNo = proNo;
        }

        public String getProName(){
            return this.proName;
        }
        public String getProNo(){
            return this.proNo;
        }
    }

    //应用收益统计
    public enum statProfit{
        TRANS_TYPE_PAYAPP(1),//交易类型-APP购买
        TRANS_TYPE_INPAYAPP(2),//交易类型-APP年费
        AGE_TYPE_OPERATOR(1),//收益方类型-运营商
        AGE_TYPE_PRODUCT(2),//收益方类型-产权方
        AGE_TYPE_PROVIDER(3),//收益方类型-服务提供商
        SPF_TYPE_SALE(1),//统计类型-销售统计
        SPF_TYPE_PROFIT(2),//统计类型-收益统计
        SPF_TYPE_TRADE(3);//统计类型-交易笔数统计
        private final int state;
        statProfit(int state) {
            this.state = state;
        }
        public int getState() {
            return this.state;
        }
    }

    //终端上送信息
    public enum posInfo{
        IS_NORMAL_YES(1),//状态正常
        IS_NORMAL_NO(0);//状态异常
        private final int state;
        posInfo(int state){this.state = state;}
        public int getState(){return this.state;}
    }

    /**
     * 版本发布范围机构表
     */
    public enum apvRangeAge {
        TEM_UPDATE_NORMAL(0),//临时修改标志-正常
        TEM_UPDATE_ADD(1),//临时修改标志-添加
        TEM_UPDATE_DEL(2),//临时修改标志-删除
        MARK_UNABLE(0),//生效标志 未启用
        MARK_NORMAL(1),//已启用
        MARK_DISABLE(2);//禁用
        private final Integer value;

        apvRangeAge(Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return this.value;
        }
    }

    /**
     * 发布范围终端
     */
    public enum apvRangePos {
        TEM_UPDATE_NORMAL(0),//临时修改标志-正常
        TEM_UPDATE_ADD(1),//临时修改标志-添加
        TEM_UPDATE_DEL(2),//临时修改标志-删除
        MARK_UNABLE(0),//生效标志-未启用
        MARK_NORMAL(1),//生效标志-正常
        MARK_DISABLE(2);//生效标志-禁用

        private final int value;

        apvRangePos (int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    /***********************************************接口中使用常量定义*************************************************/
    //审核记录 0:待审核  1:审核中  2:审核结束
    public static final int RECORD_STATE_WAITAUDIT = 0;//待审核记录
    public static final int RECORD_STATE_AUDITING = 1;//审核中记录
    public static final int RECORD_STATE_AUDITED = 2;//审核结束记录
    //审核用户类型
    public static final String AUDIT_TYPE_COMMON = "01";//版本普通审核
    public static final String AUDIT_TYPE_FINNAL = "02";//最终审核
    public static final String AUDIT_TYPE_PROSHARE = "03";//分润审核
    public static final String AUDIT_TYPE_APP_COMMON = "04";//应用普通审核
    public static final int AUDIT_TYPE_HAS_PROSHARE = 1;//用户有分润审核权限
    public static final int AUDIT_TYPE_COMMON_FMTINT = 0;//普通审核
    public static final int AUDIT_TYPE_FINNAL_FMTINT = 1;//最终审核
    public static final int AUDIT_TYPE_APP_COMMON_FMTINT = 2;//应用普通审核

    public static final int AUDIT_USER_TYPE_BUSI = 0;//业务审核员
    public static final int AUDIT_USER_TYPE_FINAL = 1;//最终审核员
    public static final int AUDIT_USER_TYPE_SAFE = 2;//安全审核员
    public static final int AUDIT_USER_TYPE_PROGRAM = 3;//项目审核员
    public static final int AUDIT_USER_TYPE_INTRO = 4;//引入方审核员

    public static final String DB_AUDIT_USER_TYPE_SAFE = "01";//安全审核员
    public static final String DB_AUDIT_USER_TYPE_FINAL = "02";//最终审核员
    public static final String DB_AUDIT_USER_TYPE_INTRO = "03";//引入方审核员
    public static final String DB_AUDIT_USER_TYPE_BUSI = "04";//业务审核员
    public static final String DB_AUDIT_USER_TYPE_PROGRAM = "05";//项目审核员

    public static final int AUDIT_BY_OPER_NO_PASS = 2;//审核不通过
    public static final int AUDIT_BY_OPER_PASS = 1;//审核通过
    //审核提醒过期时间
    public static final int NOTICE_OVER_DAYCNT = 14;//通知过期天数
    public static final int NOTICE_INTRO = 1;//通知引入方审核
    public static final int NOTICE_BUSI_SAFE = 2;//通知业务及安全审核
    public static final int NOTICE_FINAL = 3;//通知终审人
    //应用终审签名应答码
    public static final String SIGN_SUCCESS = "00";//签名成功
    //应用市场
    public static final String APPMARKET_IS_SON_YES = "1";//是否属于当前用户机构的应用市场(不属于)
    public static final String APPMARKET_IS_SON_NO = "0";//是否属于当前用户机构的应用市场(属于)
    //应用详情统计
    public static final String STATAPP_YEAR = "0";//按年统计
    public static final String STATAPP_MONTH = "1";//按月统计
    //下载文件类型
    public static final String DOWNLOAD_PROTOCOL_FILE = "1";
    public static final String DOWNLOAD_TEMP_PROTOCOL_FILE = "2";
    //应用收益统计
    public static final String STATAPPPROFIT_TYPE_RANGE = "1";
    public static final String STATAPPPROFIT_TYPE_ADDUP = "2";
    //路径类型
    public static final String PATH_TYPE_APP = "1";//路径类型-apk
    public static final String PATH_TYPE_RESOURCE = "2";//路径类型-资源
    public static final String PATH_TYPE_PROTOCOL = "3";//路径类型-协议
    public static final String PATH_TYPE_APPROTATION = "4";//路径类型-轮播图
    //TPM 在线签名应答码
    public static final String TPM_RETURN_CODE_SUCCESS = "00"; //成功
    public static final String TPM_RETURN_CODE_FAIL = "02";    //失败
    public static final String TPM_RESULT_FAIL = "0";    //失败

    //统计类型
    public static final int STAT_TOTAL = 1;//累计
    public static final int STAT_CYCLE = 2;//周期
    public static final int STATAPPVERSION_PROFIT = 6;//应用详情的统计类型-收益统计（与前端约定）

    //统计维度
    public static final int STAT_SELF = 0;//当前机构
    public static final int STAT_CHILD = 1;//当前机构及子机构

    //终端是否移机
    public static final int POS_IS_MOVE_NO = 0;//未移机
    public static final int POS_IS_MOVE_YES = 1;//移机
    public static final String POS_MOVE_DEF_DISTANCE = "99999999";//默认移机距离

    //TMS通讯参数
    public static final String APPSTORE_LOGIN_YES = "1";//应用市场支持登录
    public static final String APPSTORE_LOGIN_NO = "0";//应用市场不支持登录

    //阿里云短信发送模式
    public static final int ALIYUNSMS_MSG_MODE = 1;//使用消息服务接口
    public static final int ALIYUNSMS_SMS_MODE = 2;//使用短信服务接口

    /**
     * 终端库存相关状态
     * 0-初始入库  1-调拨出库 2-回收入库
     */
    public enum PosInvStatus {

        INV_STATUS_INIT("0"),
        INV_STATUS_ALLOCATION("1"),
        INV_STATUS_RECOVERY("2"),
        ;

        private final String value;

        PosInvStatus(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    //终端初始化配置
    public enum PosInitRes {
        POS_INIT_NOT_RELEASE(0),//未发布
        POS_INIT_RELEASE(1),//已发布
        POS_INIT_UNABLE(0),//生效标志 未启用
        POS_INIT_NORMAL(1),//已启用
        POS_INIT_DISABLE(2),//禁用
        POS_INIT_NOT_DELETE(1),//未删除
        POS_INIT_DELETE(2);//删除
        private final int value;

        PosInitRes(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    //终端初始化项配置
    public enum Posinitrestask {
        PRT_EXC_NOTFORCE(1),//任务项执行状态 1-可选
        PRT_EXC_FORCE(2),//任务项执行状态 2-强制
        PRT_EDITFILD(1),//不可修改标志  其他的所有项都为可修改
        PRT_UNABLE(0),//生效标志 未启用
        PRT_NORMAL(1),//已启用
        PRT_DISABLE(2),//禁用
        PRT_APP(1),//应用
        PRT_PARA(2),//参数
        PRT_CERT(3),//根证书
        PRT_OS(4),//ota固件
        PRT_ANIM(5);//开机动画
        private final int value;

        Posinitrestask(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    //终端初始化与终端关系
    public enum PosInitMid {
        POSMARK_UNABLE(0),//生效标志 未启用
        POSMARK_NORMAL(1),//已启用
        POSMARK_DISABLE(2);//禁用
        private final int value;

        PosInitMid(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    // 每日注册发送短信最大次数
    public static final int USER_REGISTER_SEND_MSG_MAXNUM = 5;
    // 每小时登录最大次数
    public static final int USER_LOGIN_PER_HOUR_ERR_MAXNUM = 5;
    // 每日登录最大次数
    public static final int USER_LOGIN_PER_DATE_ERR_MAXNUM = 10;
    //风控表风险类型
    public enum riskType {

        RISK_TYPE_0(0),//每小时登录
        RISK_TYPE_1(1),//每天登录
        RISK_TYPE_2(2);//每天获取注册短信验证码

        private final Integer value;

        riskType(Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return this.value;
        }
    }

    //应用管理(线上版本，审核版本，开发版本)
    public enum AppVersionType {
        ONLINE_TYPE("online"),//线上版本
        CHECK_TYPE("check"),//审核版本
        DEV_TYPE("dev");//开发版本
        private final String value;
        AppVersionType(String value) {
            this.value = value;
        }
        public String getValue() {
            return this.value;
        }
    }

    //版本文件
    public enum appVersionFile {
        SIGN_STATE_SUCC(1),//签名成功
        SIGN_STATE_FAIL(0),//签名失败
        USE_PUBLIC_YES(1),//是否使用公共证书签名-是
        USE_PUBLIC_NO(2),//是否使用公共证书签名-否
        SPLIT_STATE_SUCC(1),//拆分成功
        SPLIT_STATE_FAIL(0);//拆分失败
        private final int value;

        appVersionFile(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    //样机调试
    public enum posDebugUser {
        POS_STATE_TEST("0"),//终端状态-调试态
        POS_STATE_USE("1"),//终端状态-使用态
        SYSNO_OMS("0001"),//系统编号-oms
        SYSNO_BMS("0002"),//系统编号-bms
        SYSNO_DSP("0003");//系统编号-dsp
        private final String value;

        posDebugUser(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    /**
     * 应用审核修改的字段标记
     */
    public enum appCheckUpdateInfo {
        APPDEVNAME("appDevName"),
        APPDEVWEBURL("appDevWebUrl"),
        APPBASICTYPE("appBasicType"),
        APPNOTE("appNote"),
        APVUPDATENOTE("apvUpdateNote"),
        APVRELAREA("apvRelArea"),
        APPRESOURCES("appResources"),
        APPCOMPMODELMID("appCompModelMid"),
        APVTESTRES("apvTestRes"),
        APPVERSION("appVersion");
        private final String value;
        appCheckUpdateInfo(String value) {
            this.value = value;
        }
        public String getValue() {
            return this.value;
        }
    }

    //数据采集通知
    public enum TdPushmsg {
        MSG_PARAM_DOWNLOAD("0101"),//消息类型 参数下载通知
        MSG_PERMISSION_DOWNLOAD("0102"),//应用控制权限下载通知
        MSG_SEND_DATA("0103"),//数据上送通知
        TPM_UNABLE("0"),//生效标志 未启用
        TPM_NORMAL("1"),//生效
        TPM_DISABLE("2");//禁用
        private final String value;
        TdPushmsg(String value) {
            this.value = value;
        }
        public String getValue() {
            return this.value;
        }
    }

    //通知关联终端配置
    public enum TdPushmsgPos {
        PUSH_STATUS_WAIT(0),//消息状态 0待推送
        PUSH_STATUS_SUCC(1),//1已推送
        PUSH_STATUS_FAIL(2),//2推送失败

        DO_STATUS_WAIT(0),//是否送达终端 0未送达
        DO_STATUS_SUCC(1),//1已送达

        PUSH_UNABLE(0),//生效标志 未启用
        PUSH_NORMAL(1),//已启用
        PUSH_DISABLE(2);//禁用

        private final int value;

        TdPushmsgPos(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum OperaType{
        NOT_EXIST(1),           //1未开通企业
        EXIST_ADMIN(2),         //2开通企业且为服务商管理员
        EXIST_NOT_ADMIN(3);     //3开通企业非服务商管理员
        private int type;
        OperaType (int type) {
            this.type = type;
        }
        public int getType(){
            return type;
        }
    }

    //商户开通渠道关系
    public enum TmMerChanelMid{
        MER_REGISTER_NO(0),     //0未注册
        MER_REGISTER_SUCCESS(1),  //1注册成功
        MER_REGISTER_FAIL(2);     //2注册失败
        private int type;
        TmMerChanelMid (int type) {
            this.type = type;
        }
        public int getType(){
            return type;
        }
    }

    /**
     * 远程协助
     */
    public enum remoteAssistance {
        TOPIC("remote"),// mqtt的topic起头
        TYPE_CALL_CLIENT("0104"),// 请求报文类型-呼叫客户端
        TYPE_VIDEO("0105"),// 请求报文类型-录屏通知
        TYPE_CANCEL("0106");// 请求报文类型-取消连接通知

        private final String value;

        remoteAssistance(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    /**
     * 终端远程协助
     */
    public enum posRemoteHelp {
        STATE_WAIT(1),// 连接状态-待连接
        STATE_CONNECTING(2),// 连接状态-连接中
        STATE_CANCEL(3),// 连接状态-取消
        STATE_FAIL(4),// 连接状态-失败
        STATE_END(5),//连接状态-请求结束
        TYPE_CONNECT(1),//连接类型-远程协助连接
        MARK_UNABLE(0),//生效标志 未启用
        MARK_NORMAL(1),//已启用
        MARK_DISABLE(2);//禁用;

        private final Integer value;

        posRemoteHelp(Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return this.value;
        }
    }

    //公众号留言信息表
    public enum TmMsgLibrary{
        MSG_READ_NO(1),     //1未读
        MSG_READ_YES(2);  //2已读
        private int type;
        TmMsgLibrary (int type) {
            this.type = type;
        }
        public int getType(){
            return type;
        }
    }

    //初始化执行结果
    public enum PosinitState {
        POS_INIT_SUCCESS("01"),//成功
        POS_INIT_FAIL("00"),//失败
        LATEST_VER("54"),//已是最新版本
        INSTALL_DONE("B03"),//安装完成
        INSTALL_FAIL("B04"),//安装失败
        UPDATE_INSTALL_DONE("C03"),//更新安装完成
        UPDATE_INSTALL_FAIL("C04"),//更新安装失败
        TASK_DONE("F01"),//任务完成
        DOWNLOAD_FAIL("A04"),//下载失败
        DOWNLOAD_CANCEL("A05"),//下载取消
        TASK_FAIL("E05");//任务失败
        private final String value;

        PosinitState(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    //展会订单处理状态
    public enum TmOrder{
        Ord_State_NO(1),     //1未处理
        Ord_State_YES(2);  //2已处理
        private int ordState;
        TmOrder (int type) {
            this.ordState = type;
        }
        public int getType(){
            return ordState;
        }
    }

    public enum PageDefault{
        Default_Page(1),     //第一页
        Default_Size(15),  //15条记录
        First_Page(1);      //第一页
        private int pageDefault;
        PageDefault (int type) {
            this.pageDefault = type;
        }
        public int getType(){
            return pageDefault;
        }
    }

}
