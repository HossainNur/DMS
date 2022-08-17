package com.inovex.bikroyik.data.interfaces;

import com.inovex.bikroyik.data.model.DiscountDetails;

public interface DiscountCallBack {
    void callback(DiscountDetails discountDetails, boolean shouldApplyDiscount);
}
