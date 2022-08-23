package cn.ofpp;

import cn.hutool.core.util.StrUtil;
import cn.ofpp.core.Wx;

/**
 * 引导配置
 *
 * @author DokiYolo
 * Date 2022-08-22
 */
public class Bootstrap {

    /**
     * 公众号AppID
     */
    public static final String APP_ID = "wxa9fd071ee9ce4117";

    /**
     * 公众号秘钥
     */
    public static final String SECRET = "86d41d7483df8fb27a7ac22fc8d62324";

    /**
     * 全局模板ID  也可针对单个Friend指定模板
     */
    public static final String TEMPLATE_ID = "WejoorRZBtocrXMdoVXA5KLofXP-aFnnVqAZH5jbASE";

    /**
     * 初始化
     */
    public static void init() {
        if (StrUtil.hasEmpty(APP_ID, SECRET, TEMPLATE_ID)) {
            throw new IllegalArgumentException("请检查配置");
        }
        Wx.init();
    }

}
