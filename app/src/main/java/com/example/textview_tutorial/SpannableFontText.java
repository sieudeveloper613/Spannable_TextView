package com.example.textview_tutorial;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;

public class SpannableFontText {
    /*
    Eng : Spannable Font - In order to set a different font size to some portion of text,
    a RelativeSizeSpan can be used
    Vie : Font mở rộng - để thiết lập kích thước phông chữ cho một vài phần của văn bản,
    RelativeSizeSpan có thể được sử dụng.
     */

    public Spannable setSpannableFont(String firstWord, String lastWord){
        Spannable spannable = new SpannableString(firstWord + " " + lastWord);
        spannable.setSpan(new RelativeSizeSpan(1.1f), 0, firstWord.length(),
                          Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // set size
        spannable.setSpan(new RelativeSizeSpan(2.2f), firstWord.length(),
                          firstWord.length() + lastWord.length() + 1,
                          Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); //set size;
        return spannable;
    }
}
