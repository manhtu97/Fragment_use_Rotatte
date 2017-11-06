package com.example.admin.fragment_list;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by admin on 11/1/2017.
 */

public class Fragment_Content extends Fragment {
    @Nullable
    View view;
    WebView webView;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_content,container,false);
        webView = (WebView) view.findViewById(R.id.webView);
        return view;
    }
    public void SetURL(String link){
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(link);
    }
}
