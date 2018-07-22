package com.jhkj.weapp.common.filter;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@Data
public class SuffixFilter {

    private List<String> whitelist;
    private List<String> blacklist;
    private boolean defaultPolicy = true;

    /**
     * 过滤后缀名
     *
     * @param suffix 指定后缀名
     * @return 能否通过
     */
    public boolean filter(String suffix) {
        if (suffix == null) {
            return false;
        }
        suffix = suffix.trim().toLowerCase();
        for (String white : whitelist) {
            if (white.equals(suffix)) {
                return true;
            }
        }
        for (String black : blacklist) {
            if (black.equals(suffix)) {
                return false;
            }
        }
        return defaultPolicy;
    }

    public SuffixFilter() {
        whitelist = new ArrayList();
        whitelist.add("jpg");
        whitelist.add("png");
        whitelist.add("gif");
        whitelist.add("bmp");
        whitelist.add("jpeg");
        blacklist = new ArrayList();
        blacklist.add("jsp");
        blacklist.add("asp");
        blacklist.add("aspx");
        blacklist.add("php");
        blacklist.add("java");
        blacklist.add("class");
    }

}
