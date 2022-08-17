// Generated by view binder compiler. Do not edit!
package com.inovex.bikroyik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.inovex.bikroyik.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNewSalesOrderBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout llBottomMenu;

  @NonNull
  public final LinearLayout llGrandTotal;

  @NonNull
  public final LinearLayout llRecycler;

  @NonNull
  public final LinearLayout llRetailerPointInfo;

  @NonNull
  public final LinearLayout llTableTitle;

  @NonNull
  public final LinearLayout llTotal;

  @NonNull
  public final Spinner marketSpinner;

  @NonNull
  public final Spinner retailerSpinner;

  @NonNull
  public final RecyclerView rvNewOrder;

  @NonNull
  public final ToolbarMeetingBinding tbToolbarMeeting;

  @NonNull
  public final TextView tvAddProduct;

  @NonNull
  public final TextView tvClearList;

  @NonNull
  public final TextView tvGrandTotalPrice;

  @NonNull
  public final TextView tvSubmitOrder;

  @NonNull
  public final TextView tvSyncProduct;

  @NonNull
  public final TextView tvTotalPrice;

  private ActivityNewSalesOrderBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout llBottomMenu, @NonNull LinearLayout llGrandTotal,
      @NonNull LinearLayout llRecycler, @NonNull LinearLayout llRetailerPointInfo,
      @NonNull LinearLayout llTableTitle, @NonNull LinearLayout llTotal,
      @NonNull Spinner marketSpinner, @NonNull Spinner retailerSpinner,
      @NonNull RecyclerView rvNewOrder, @NonNull ToolbarMeetingBinding tbToolbarMeeting,
      @NonNull TextView tvAddProduct, @NonNull TextView tvClearList,
      @NonNull TextView tvGrandTotalPrice, @NonNull TextView tvSubmitOrder,
      @NonNull TextView tvSyncProduct, @NonNull TextView tvTotalPrice) {
    this.rootView = rootView;
    this.llBottomMenu = llBottomMenu;
    this.llGrandTotal = llGrandTotal;
    this.llRecycler = llRecycler;
    this.llRetailerPointInfo = llRetailerPointInfo;
    this.llTableTitle = llTableTitle;
    this.llTotal = llTotal;
    this.marketSpinner = marketSpinner;
    this.retailerSpinner = retailerSpinner;
    this.rvNewOrder = rvNewOrder;
    this.tbToolbarMeeting = tbToolbarMeeting;
    this.tvAddProduct = tvAddProduct;
    this.tvClearList = tvClearList;
    this.tvGrandTotalPrice = tvGrandTotalPrice;
    this.tvSubmitOrder = tvSubmitOrder;
    this.tvSyncProduct = tvSyncProduct;
    this.tvTotalPrice = tvTotalPrice;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNewSalesOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNewSalesOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_new_sales_order, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNewSalesOrderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.llBottomMenu;
      LinearLayout llBottomMenu = rootView.findViewById(id);
      if (llBottomMenu == null) {
        break missingId;
      }

      id = R.id.llGrandTotal;
      LinearLayout llGrandTotal = rootView.findViewById(id);
      if (llGrandTotal == null) {
        break missingId;
      }

      id = R.id.llRecycler;
      LinearLayout llRecycler = rootView.findViewById(id);
      if (llRecycler == null) {
        break missingId;
      }

      id = R.id.llRetailerPointInfo;
      LinearLayout llRetailerPointInfo = rootView.findViewById(id);
      if (llRetailerPointInfo == null) {
        break missingId;
      }

      id = R.id.llTableTitle;
      LinearLayout llTableTitle = rootView.findViewById(id);
      if (llTableTitle == null) {
        break missingId;
      }

      id = R.id.llTotal;
      LinearLayout llTotal = rootView.findViewById(id);
      if (llTotal == null) {
        break missingId;
      }

      id = R.id.market_spinner;
      Spinner marketSpinner = rootView.findViewById(id);
      if (marketSpinner == null) {
        break missingId;
      }

      id = R.id.retailer_spinner;
      Spinner retailerSpinner = rootView.findViewById(id);
      if (retailerSpinner == null) {
        break missingId;
      }

      id = R.id.rvNewOrder;
      RecyclerView rvNewOrder = rootView.findViewById(id);
      if (rvNewOrder == null) {
        break missingId;
      }

      id = R.id.tbToolbarMeeting;
      View tbToolbarMeeting = rootView.findViewById(id);
      if (tbToolbarMeeting == null) {
        break missingId;
      }
      ToolbarMeetingBinding binding_tbToolbarMeeting = ToolbarMeetingBinding.bind(tbToolbarMeeting);

      id = R.id.tvAddProduct;
      TextView tvAddProduct = rootView.findViewById(id);
      if (tvAddProduct == null) {
        break missingId;
      }

      id = R.id.tvClearList;
      TextView tvClearList = rootView.findViewById(id);
      if (tvClearList == null) {
        break missingId;
      }

      id = R.id.tvGrandTotalPrice;
      TextView tvGrandTotalPrice = rootView.findViewById(id);
      if (tvGrandTotalPrice == null) {
        break missingId;
      }

      id = R.id.tvSubmitOrder;
      TextView tvSubmitOrder = rootView.findViewById(id);
      if (tvSubmitOrder == null) {
        break missingId;
      }

      id = R.id.tvSyncProduct;
      TextView tvSyncProduct = rootView.findViewById(id);
      if (tvSyncProduct == null) {
        break missingId;
      }

      id = R.id.tvTotalPrice;
      TextView tvTotalPrice = rootView.findViewById(id);
      if (tvTotalPrice == null) {
        break missingId;
      }

      return new ActivityNewSalesOrderBinding((LinearLayout) rootView, llBottomMenu, llGrandTotal,
          llRecycler, llRetailerPointInfo, llTableTitle, llTotal, marketSpinner, retailerSpinner,
          rvNewOrder, binding_tbToolbarMeeting, tvAddProduct, tvClearList, tvGrandTotalPrice,
          tvSubmitOrder, tvSyncProduct, tvTotalPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}