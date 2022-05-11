package com.example.textview_tutorial;

import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class SpannableColorText {
    /*
    Eng : spannable textview can be used in android to highlight a particular portion of textview
    with a different color, style, font, size and/or click event in a single TextView widget.

    Vie : Textview mở rộng (spannable textview) được sử dụng trong android với mục đích làm nổi bật
    những thành phần cụ thể trong textview như là màu sắc, kiểu chữ, phông chữ, kích thước hay/và
    các sự kiện nhấp chuột trong tiện ích textview đơn thuần.
    */

    // Eng : in order to set a different color to some portion of text, -ForegroundColorSpan- can be used.
    // Vie : để thiết lập một màu sắc khác cho vài phần của văn bản, ForegroundColorSpan có thể được sử dụng ở đây

    @NonNull
    public Spannable setSpannableColor(String firstWord, String lastWord){
        Spannable spannable = new SpannableString(firstWord + " " + lastWord);
        spannable.setSpan(new ForegroundColorSpan(Color.RED),0, firstWord.length(),
                          Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan(new ForegroundColorSpan(Color.GREEN), firstWord.length(),
                          firstWord.length() + lastWord.length() + 1,
                          Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spannable;
    }
}
