package com.yc.love.model.engin;

import android.content.Context;
import android.util.Log;

import com.alibaba.fastjson.TypeReference;
import com.kk.securityhttp.engin.HttpCoreEngin;
import com.yc.love.model.base.BaseEngine;
import com.yc.love.model.bean.AResultInfo;
import com.yc.love.model.bean.CategoryArticleBean;
import com.yc.love.model.bean.ExampleTsBean;
import com.yc.love.model.bean.LoveByStagesBean;
import com.yc.love.model.bean.LoveByStagesDetailsBean;
import com.yc.love.model.bean.LoveHealDateBean;
import com.yc.love.model.bean.LoveHealDetBean;
import com.yc.love.model.domain.URLConfig;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.Observable;

/**
 * Created by mayn on 2019/5/9.
 */

public class LoveEngin extends BaseEngine {

    public LoveEngin(Context context) {
        super(context);
    }

    public Observable<AResultInfo<List<String>>> abc(String url) {
        Map<String, String> params = new HashMap<>();
//        params.put("password", password);
        requestParams(params);
        HttpCoreEngin<AResultInfo<List<String>>> httpCoreEngin = HttpCoreEngin.get(mContext);
        Observable<AResultInfo<List<String>>> rxpost = httpCoreEngin.rxpost(URLConfig.getUrl(url), new TypeReference<AResultInfo<List<String>>>() {
                }.getType(),
                params,
                true,
                true, true);
        return rxpost;
    }


    public Observable<AResultInfo<List<LoveHealDateBean>>> loveCategory(String url) {
        Map<String, String> params = new HashMap<>();
//        params.put("password", password);
        requestParams(params);
        HttpCoreEngin<AResultInfo<List<LoveHealDateBean>>> httpCoreEngin = HttpCoreEngin.get(mContext);
        Observable<AResultInfo<List<LoveHealDateBean>>> rxpost = httpCoreEngin.rxpost(URLConfig.getUrl(url), new TypeReference<AResultInfo<List<LoveHealDateBean>>>() {
                }.getType(),
                params,
                true,
                true, true);
        return rxpost;
    }

    public Observable<AResultInfo<List<LoveHealDetBean>>> loveListCategory(String category_id, String page, String page_size, String url) {
        Map<String, String> params = new HashMap<>();
        params.put("category_id", category_id);
        params.put("page", page);
        params.put("page_size", page_size);
        requestParams(params);
        HttpCoreEngin<AResultInfo<List<LoveHealDetBean>>> httpCoreEngin = HttpCoreEngin.get(mContext);
        Observable<AResultInfo<List<LoveHealDetBean>>> rxpost = httpCoreEngin.rxpost(URLConfig.getUrl(url), new TypeReference<AResultInfo<List<LoveHealDetBean>>>() {
                }.getType(),
                params,
                true,
                true, true);
        return rxpost;
    }

    public Observable<AResultInfo<List<ExampleTsBean>>> exampleTs(String url) {
        Map<String, String> params = new HashMap<>();
//        params.put("password", password);
        requestParams(params);
        HttpCoreEngin<AResultInfo<List<ExampleTsBean>>> httpCoreEngin = HttpCoreEngin.get(mContext);
        Observable<AResultInfo<List<ExampleTsBean>>> rxpost = httpCoreEngin.rxpost(URLConfig.getUrl(url), new TypeReference<AResultInfo<List<ExampleTsBean>>>() {
                }.getType(),
                params,
                true,
                true, true);
        return rxpost;
    }

    public Observable<AResultInfo<List<CategoryArticleBean>>> categoryArticle(String url) {
        Map<String, String> params = new HashMap<>();
//        params.put("password", password);
        requestParams(params);
        HttpCoreEngin<AResultInfo<List<CategoryArticleBean>>> httpCoreEngin = HttpCoreEngin.get(mContext);
        Observable<AResultInfo<List<CategoryArticleBean>>> rxpost = httpCoreEngin.rxpost(URLConfig.getUrl(url), new TypeReference<AResultInfo<List<CategoryArticleBean>>>() {
                }.getType(),
                params,
                true,
                true, true);
        return rxpost;
    }

    public Observable<AResultInfo<List<LoveByStagesBean>>> listsArticle(String categoryId, String page, String pageSize, String url) {
        Map<String, String> params = new HashMap<>();
        params.put("category_id", categoryId);
        params.put("page", page);
        params.put("page_size", pageSize);
        requestParams(params);
        HttpCoreEngin<AResultInfo<List<LoveByStagesBean>>> httpCoreEngin = HttpCoreEngin.get(mContext);
        Observable<AResultInfo<List<LoveByStagesBean>>> rxpost = httpCoreEngin.rxpost(URLConfig.getUrl(url), new TypeReference<AResultInfo<List<LoveByStagesBean>>>() {
                }.getType(),
                params,
                true,
                true, true);
        return rxpost;
    }

    public Observable<AResultInfo<LoveByStagesDetailsBean>> detailArticle(String id, String url) {
        Map<String, String> params = new HashMap<>();
        params.put("id", id);
        requestParams(params);
        HttpCoreEngin<AResultInfo<LoveByStagesDetailsBean>> httpCoreEngin = HttpCoreEngin.get(mContext);
        Observable<AResultInfo<LoveByStagesDetailsBean>> rxpost = httpCoreEngin.rxpost(URLConfig.getUrl(url), new TypeReference<AResultInfo<LoveByStagesDetailsBean>>() {
                }.getType(),
                params,
                true,
                true, true);
        return rxpost;
    }

    public Observable<AResultInfo<String>> exampleTsList(String tagId, String page, String pageSize, String url) {
        Map<String, String> params = new HashMap<>();
        params.put("tag_id", tagId);
        params.put("page", page);
        params.put("page_size", pageSize);
        requestParams(params);
        HttpCoreEngin<AResultInfo<String>> httpCoreEngin = HttpCoreEngin.get(mContext);
        Observable<AResultInfo<String>> rxpost = httpCoreEngin.rxpost(URLConfig.getUrl(url), new TypeReference<AResultInfo<String>>() {
                }.getType(),
                params,
                true,
                true, true);
        return rxpost;
    }


}
