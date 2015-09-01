package com.aswifter.material;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aswifter.material.widget.BackHandledFragment;
import com.aswifter.material.widget.ProgressWebView;

/**
 * Created by Chenyc on 15/6/27.
 */
public class BlogFragment extends BackHandledFragment {

    private ProgressWebView mWebView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blog, null);
        mWebView = (ProgressWebView) view.findViewById(R.id.webView);
        mWebView.getSettings().setJavaScriptEnabled(true);
//        mWebView.loadUrl("http://www.aswifter.com/");
        mWebView.loadUrl("http://wx.zlycn.com/TemplateVerify.aspx?443C6B39D7EFA7EA509A0E606EFA31BA=3593EFA4552238B19D02A0CC3F225BD1&5621BF84742AD787=45B38838D3691B65&9A6E94125DB8FACD=DF7066AD505A43FD&D256682CACCE6DCCE56065E3BE7C8C08=5D67B023DD9DE93B");
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public String getTagText() {
        return null;
    }

    @Override
    public boolean onBackPressed() {
        if(mWebView.canGoBack()){
            mWebView.goBack();
            return true;
        }

        return false;
    }
}
