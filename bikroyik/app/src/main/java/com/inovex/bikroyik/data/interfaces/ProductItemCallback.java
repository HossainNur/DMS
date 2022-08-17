package com.inovex.bikroyik.data.interfaces;

import com.inovex.bikroyik.data.model.ProductModel;

public interface ProductItemCallback {
    public void success(ProductModel productModelList, int itemSize);
}
