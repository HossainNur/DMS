// Generated by view binder compiler. Do not edit!
package com.inovex.bikroyik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.inovex.bikroyik.R;
import com.jaredrummler.materialspinner.MaterialSpinner;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AddProductDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText etDialogProductQuantity;

  @NonNull
  public final EditText etDialogTotalPrice;

  @NonNull
  public final LinearLayout ivCancelDialog;

  @NonNull
  public final MaterialSpinner productSpinner;

  @NonNull
  public final TextView tvCancelDialog;

  @NonNull
  public final TextView tvDialogProductDiscount;

  @NonNull
  public final TextView tvDialogProductId;

  @NonNull
  public final TextView tvDialogProductName;

  @NonNull
  public final TextView tvDialogProductPrice;

  @NonNull
  public final TextView tvDialogProductStock;

  @NonNull
  public final TextView tvDoneAddProductDialog;

  @NonNull
  public final TextView tvProductPrice;

  @NonNull
  public final TextView tvProductQuantity;

  private AddProductDialogBinding(@NonNull LinearLayout rootView,
      @NonNull EditText etDialogProductQuantity, @NonNull EditText etDialogTotalPrice,
      @NonNull LinearLayout ivCancelDialog, @NonNull MaterialSpinner productSpinner,
      @NonNull TextView tvCancelDialog, @NonNull TextView tvDialogProductDiscount,
      @NonNull TextView tvDialogProductId, @NonNull TextView tvDialogProductName,
      @NonNull TextView tvDialogProductPrice, @NonNull TextView tvDialogProductStock,
      @NonNull TextView tvDoneAddProductDialog, @NonNull TextView tvProductPrice,
      @NonNull TextView tvProductQuantity) {
    this.rootView = rootView;
    this.etDialogProductQuantity = etDialogProductQuantity;
    this.etDialogTotalPrice = etDialogTotalPrice;
    this.ivCancelDialog = ivCancelDialog;
    this.productSpinner = productSpinner;
    this.tvCancelDialog = tvCancelDialog;
    this.tvDialogProductDiscount = tvDialogProductDiscount;
    this.tvDialogProductId = tvDialogProductId;
    this.tvDialogProductName = tvDialogProductName;
    this.tvDialogProductPrice = tvDialogProductPrice;
    this.tvDialogProductStock = tvDialogProductStock;
    this.tvDoneAddProductDialog = tvDoneAddProductDialog;
    this.tvProductPrice = tvProductPrice;
    this.tvProductQuantity = tvProductQuantity;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AddProductDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AddProductDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.add_product_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AddProductDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.etDialogProductQuantity;
      EditText etDialogProductQuantity = rootView.findViewById(id);
      if (etDialogProductQuantity == null) {
        break missingId;
      }

      id = R.id.etDialogTotalPrice;
      EditText etDialogTotalPrice = rootView.findViewById(id);
      if (etDialogTotalPrice == null) {
        break missingId;
      }

      id = R.id.ivCancelDialog;
      LinearLayout ivCancelDialog = rootView.findViewById(id);
      if (ivCancelDialog == null) {
        break missingId;
      }

      id = R.id.productSpinner;
      MaterialSpinner productSpinner = rootView.findViewById(id);
      if (productSpinner == null) {
        break missingId;
      }

      id = R.id.tvCancelDialog;
      TextView tvCancelDialog = rootView.findViewById(id);
      if (tvCancelDialog == null) {
        break missingId;
      }

      id = R.id.tvDialogProductDiscount;
      TextView tvDialogProductDiscount = rootView.findViewById(id);
      if (tvDialogProductDiscount == null) {
        break missingId;
      }

      id = R.id.tvDialogProductId;
      TextView tvDialogProductId = rootView.findViewById(id);
      if (tvDialogProductId == null) {
        break missingId;
      }

      id = R.id.tvDialogProductName;
      TextView tvDialogProductName = rootView.findViewById(id);
      if (tvDialogProductName == null) {
        break missingId;
      }

      id = R.id.tvDialogProductPrice;
      TextView tvDialogProductPrice = rootView.findViewById(id);
      if (tvDialogProductPrice == null) {
        break missingId;
      }

      id = R.id.tvDialogProductStock;
      TextView tvDialogProductStock = rootView.findViewById(id);
      if (tvDialogProductStock == null) {
        break missingId;
      }

      id = R.id.tvDoneAddProductDialog;
      TextView tvDoneAddProductDialog = rootView.findViewById(id);
      if (tvDoneAddProductDialog == null) {
        break missingId;
      }

      id = R.id.tvProductPrice;
      TextView tvProductPrice = rootView.findViewById(id);
      if (tvProductPrice == null) {
        break missingId;
      }

      id = R.id.tvProductQuantity;
      TextView tvProductQuantity = rootView.findViewById(id);
      if (tvProductQuantity == null) {
        break missingId;
      }

      return new AddProductDialogBinding((LinearLayout) rootView, etDialogProductQuantity,
          etDialogTotalPrice, ivCancelDialog, productSpinner, tvCancelDialog,
          tvDialogProductDiscount, tvDialogProductId, tvDialogProductName, tvDialogProductPrice,
          tvDialogProductStock, tvDoneAddProductDialog, tvProductPrice, tvProductQuantity);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
