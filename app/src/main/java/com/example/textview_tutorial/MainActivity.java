package com.example.textview_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // View and ViewGroup
    TextView tvSpannableColor,
             tvSpannableFont,
             tvSpannableTypeface;

    // Object and References
    String firstWord, lastWord;
    SpannableColorText spanColor;
    SpannableFontText spanFont;
    SpannableTypefaceText spanTypeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define id for view
        initView();

        // Define event for view
        initControl();

        // Define method
        coloredTextView();
        fontSizeTextView();
        typefaceTextView();
    }

    private void initView(){
        tvSpannableColor = findViewById(R.id.tv_spannable_color);
        tvSpannableFont = findViewById(R.id.tv_spannable_font);
        tvSpannableTypeface = findViewById(R.id.tv_spannable_typeface);
    }

    private void initControl(){
        // White something here...

    }

    private void coloredTextView(){
        spanColor = new SpannableColorText();
        firstWord = "Android";
        lastWord = "Development";
        tvSpannableColor.setText(spanColor.setSpannableColor(firstWord, lastWord));
    }

    private void fontSizeTextView(){
        spanFont = new SpannableFontText();
        firstWord = "Android";
        lastWord = "Developer";
        tvSpannableFont.setText(spanFont.setSpannableFont(firstWord, lastWord));
    }

    private void typefaceTextView(){
        spanTypeface = new SpannableTypefaceText();
        firstWord = "Android";
        lastWord = "Application";
        tvSpannableTypeface.setText(spanTypeface.setSpannableTypeface(firstWord, lastWord));
    }
}