package com.inovex.bikroyik.adapter;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.inovex.bikroyik.R;


/**
 * Created by DELL on 7/31/2018.
 */

public class ItemCardView extends RelativeLayout {

    private ImageView cardImage;

    public void setCardName(String cardName) {
        this.cardName.setText(cardName);
    }

    public TextView cardName;

    private Context mContext;

    public ItemCardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
        mContext = context;
        TypedArray a = context.obtainStyledAttributes(attrs,
                R.styleable.ItemCardView);

        cardName.setText(a.getString(R.styleable.ItemCardView_card_name));
        cardImage.setImageDrawable(a.getDrawable(R.styleable.ItemCardView_card_image));

        a.recycle();
    }

    public ItemCardView(Context context) {
        super(context);
        initView(context);
    }

    private void initView(Context context) {
        View view = View.inflate(context, R.layout.item_card_view, this);
        cardImage = (ImageView) view.findViewById(R.id.card_image);
        cardName = (TextView) view.findViewById(R.id.card_name);
    }


}

