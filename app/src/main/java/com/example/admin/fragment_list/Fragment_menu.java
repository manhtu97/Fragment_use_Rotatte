package com.example.admin.fragment_list;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by admin on 11/1/2017.
 */

public class Fragment_menu extends ListFragment {
    WebView webView;
    String[] arrayWEB = {"24h","Dan Tri","Genk","TinhTe","VietNamnet"};
    ArrayAdapter adapter;
    StringURL linkURL;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        linkURL = (StringURL) getActivity();
        adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,arrayWEB);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_menu_list,container,false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
//        webView = (WebView) getActivity().findViewById(R.id.webView);
//        webView.setWebViewClient(new WebViewClient());
//        webView.getSettings().setLoadsImagesAutomatically(true);
//        webView.getSettings().setJavaScriptEnabled(true);
//        //webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
//
        switch (position){
            case 0:{
//                String url = "https://m.24h.com.vn/";
//                webView.loadUrl(url);
                linkURL.LoadURL("https://m.24h.com.vn/");
                break;
            }
            case 1:{
//                String url = "http://m.dantri.com.vn/";
//                webView.loadUrl(url);
                linkURL.LoadURL("http://m.dantri.com.vn/");
                break;
            }
            case 2:{
//                String url = "http://m.genk.vn/";
//                webView.loadUrl(url);
                linkURL.LoadURL("http://m.genk.vn/");
                break;
            }
            case 3:{
//                String url = "http://m.tinhte.vn/";
//                webView.loadUrl(url);
                linkURL.LoadURL("https://tinhte.vn/");
                break;
            }
            case 4:{
//                String url = "http://m.vietnamnet.vn/";
//                webView.loadUrl(url);
                linkURL.LoadURL("http://m.vietnamnet.vn/");
                break;
            }
        }
        super.onListItemClick(l, v, position, id);
    }
}
