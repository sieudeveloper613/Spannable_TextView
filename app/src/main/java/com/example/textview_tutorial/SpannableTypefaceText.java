package com.example.textview_tutorial;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;

public class SpannableTypefaceText {
    /*
    Eng : Spannable typeface - In order to set a different font typeface to some portion of text, a
    custom TypefaceSpan can be used
    Vie : kiểu chữ mở rộng - để thiết lập kiểu phông chữ khác cho văn bản, TypefaceSpan cần được
    chỉnh sửa và có thể sử dụng
     */

    public Spannable setSpannableTypeface(String firstWord, String lastWord){
        Spannable spannable = new SpannableString(firstWord + " " + lastWord);
        spannable.setSpan( new CustomTypefaceSpan("SFUIText-Bold.otf", Typeface.MONOSPACE),
                0,
                firstWord.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan( new CustomTypefaceSpan("SFUIText-Regular.otf", Typeface.SANS_SERIF),
                firstWord.length(), firstWord.length() + lastWord.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spannable;
    }
}
