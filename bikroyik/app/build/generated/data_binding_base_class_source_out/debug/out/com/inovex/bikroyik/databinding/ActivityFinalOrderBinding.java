// Generated by view binder compiler. Do not edit!
package com.inovex.bikroyik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.inovex.bikroyik.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFinalOrderBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnNewSale;

  @NonNull
  public final CardView cardFooter;

  @NonNull
  public final ConstraintLayout consHeaderParent;

  @NonNull
  public final RecyclerView finalRecycler;

  @NonNull
  public final CardView finalScroll;

  @NonNull
  public final ImageView ivClosePrint;

  @NonNull
  public final LinearLayout llTittle;

  @NonNull
  public final TextView orderId;

  @NonNull
  public final LinearLayout printReceipt;

  @NonNull
  public final TextView retailOwner;

  @NonNull
  public final ConstraintLayout rootPrintView;

  @NonNull
  public final LinearLayout shareReceipt;

  @NonNull
  public final TextView tvBikriKorechen;

  @NonNull
  public final TextView tvDate;

  @NonNull
  public final TextView tvDue;

  @NonNull
  public final TextView tvHelpline;

  @NonNull
  public final TextView tvStoreContact;

  @NonNull
  public final TextView tvStoreName;

  @NonNull
  public final TextView tvTakaMuller;

  @NonNull
  public final TextView tvTotalDiscount;

  @NonNull
  public final TextView tvTotalPaid;

  @NonNull
  public final TextView tvTotalPrice;

  @NonNull
  public final TextView tvTotalPriceInTittle;

  @NonNull
  public final TextView tvTotalPriceWithoutDiscount;

  @NonNull
  public final TextView tvTotalTax;

  @NonNull
  public final TextView tvUserContact;

  @NonNull
  public final TextView tvUserName;

  private ActivityFinalOrderBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnNewSale,
      @NonNull CardView cardFooter, @NonNull ConstraintLayout consHeaderParent,
      @NonNull RecyclerView finalRecycler, @NonNull CardView finalScroll,
      @NonNull ImageView ivClosePrint, @NonNull LinearLayout llTittle, @NonNull TextView orderId,
      @NonNull LinearLayout printReceipt, @NonNull TextView retailOwner,
      @NonNull ConstraintLayout rootPrintView, @NonNull LinearLayout shareReceipt,
      @NonNull TextView tvBikriKorechen, @NonNull TextView tvDate, @NonNull TextView tvDue,
      @NonNull TextView tvHelpline, @NonNull TextView tvStoreContact, @NonNull TextView tvStoreName,
      @NonNull TextView tvTakaMuller, @NonNull TextView tvTotalDiscount,
      @NonNull TextView tvTotalPaid, @NonNull TextView tvTotalPrice,
      @NonNull TextView tvTotalPriceInTittle, @NonNull TextView tvTotalPriceWithoutDiscount,
      @NonNull TextView tvTotalTax, @NonNull TextView tvUserContact, @NonNull TextView tvUserName) {
    this.rootView = rootView;
    this.btnNewSale = btnNewSale;
    this.cardFooter = cardFooter;
    this.consHeaderParent = consHeaderParent;
    this.finalRecycler = finalRecycler;
    this.finalScroll = finalScroll;
    this.ivClosePrint = ivClosePrint;
    this.llTittle = llTittle;
    this.orderId = orderId;
    this.printReceipt = printReceipt;
    this.retailOwner = retailOwner;
    this.rootPrintView = rootPrintView;
    this.shareReceipt = shareReceipt;
    this.tvBikriKorechen = tvBikriKorechen;
    this.tvDate = tvDate;
    this.tvDue = tvDue;
    this.tvHelpline = tvHelpline;
    this.tvStoreContact = tvStoreContact;
    this.tvStoreName = tvStoreName;
    this.tvTakaMuller = tvTakaMuller;
    this.tvTotalDiscount = tvTotalDiscount;
    this.tvTotalPaid = tvTotalPaid;
    this.tvTotalPrice = tvTotalPrice;
    this.tvTotalPriceInTittle = tvTotalPriceInTittle;
    this.tvTotalPriceWithoutDiscount = tvTotalPriceWithoutDiscount;
    this.tvTotalTax = tvTotalTax;
    this.tvUserContact = tvUserContact;
    this.tvUserName = tvUserName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFinalOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFinalOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_final_order, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFinalOrderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_newSale;
      Button btnNewSale = rootView.findViewById(id);
      if (btnNewSale == null) {
        break missingId;
      }

      id = R.id.card_footer;
      CardView cardFooter = rootView.findViewById(id);
      if (cardFooter == null) {
        break missingId;
      }

      id = R.id.cons_header_parent;
      ConstraintLayout consHeaderParent = rootView.findViewById(id);
      if (consHeaderParent == null) {
        break missingId;
      }

      id = R.id.final_recycler;
      RecyclerView finalRecycler = rootView.findViewById(id);
      if (finalRecycler == null) {
        break missingId;
      }

      id = R.id.final_scroll;
      CardView finalScroll = rootView.findViewById(id);
      if (finalScroll == null) {
        break missingId;
      }

      id = R.id.iv_close_print;
      ImageView ivClosePrint = rootView.findViewById(id);
      if (ivClosePrint == null) {
        break missingId;
      }

      id = R.id.ll_tittle;
      LinearLayout llTittle = rootView.findViewById(id);
      if (llTittle == null) {
        break missingId;
      }

      id = R.id.order_id;
      TextView orderId = rootView.findViewById(id);
      if (orderId == null) {
        break missingId;
      }

      id = R.id.print_receipt;
      LinearLayout printReceipt = rootView.findViewById(id);
      if (printReceipt == null) {
        break missingId;
      }

      id = R.id.retail_owner;
      TextView retailOwner = rootView.findViewById(id);
      if (retailOwner == null) {
        break missingId;
      }

      ConstraintLayout rootPrintView = (ConstraintLayout) rootView;

      id = R.id.share_receipt;
      LinearLayout shareReceipt = rootView.findViewById(id);
      if (shareReceipt == null) {
        break missingId;
      }

      id = R.id.tv_bikri_korechen;
      TextView tvBikriKorechen = rootView.findViewById(id);
      if (tvBikriKorechen == null) {
        break missingId;
      }

      id = R.id.tv_date;
      TextView tvDate = rootView.findViewById(id);
      if (tvDate == null) {
        break missingId;
      }

      id = R.id.tv_Due;
      TextView tvDue = rootView.findViewById(id);
      if (tvDue == null) {
        break missingId;
      }

      id = R.id.tv_helpline;
      TextView tvHelpline = rootView.findViewById(id);
      if (tvHelpline == null) {
        break missingId;
      }

      id = R.id.tv_storeContact;
      TextView tvStoreContact = rootView.findViewById(id);
      if (tvStoreContact == null) {
        break missingId;
      }

      id = R.id.tv_store_name;
      TextView tvStoreName = rootView.findViewById(id);
      if (tvStoreName == null) {
        break missingId;
      }

      id = R.id.tv_taka_muller;
      TextView tvTakaMuller = rootView.findViewById(id);
      if (tvTakaMuller == null) {
        break missingId;
      }

      id = R.id.tv_Total_Discount;
      TextView tvTotalDiscount = rootView.findViewById(id);
      if (tvTotalDiscount == null) {
        break missingId;
      }

      id = R.id.tv_totalPaid;
      TextView tvTotalPaid = rootView.findViewById(id);
      if (tvTotalPaid == null) {
        break missingId;
      }

      id = R.id.tv_Total_Price;
      TextView tvTotalPrice = rootView.findViewById(id);
      if (tvTotalPrice == null) {
        break missingId;
      }

      id = R.id.tv_totalPrice_InTittle;
      TextView tvTotalPriceInTittle = rootView.findViewById(id);
      if (tvTotalPriceInTittle == null) {
        break missingId;
      }

      id = R.id.tv_Total_Price_without_discount;
      TextView tvTotalPriceWithoutDiscount = rootView.findViewById(id);
      if (tvTotalPriceWithoutDiscount == null) {
        break missingId;
      }

      id = R.id.tv_Total_tax;
      TextView tvTotalTax = rootView.findViewById(id);
      if (tvTotalTax == null) {
        break missingId;
      }

      id = R.id.tv_userContact;
      TextView tvUserContact = rootView.findViewById(id);
      if (tvUserContact == null) {
        break missingId;
      }

      id = R.id.tv_user_name;
      TextView tvUserName = rootView.findViewById(id);
      if (tvUserName == null) {
        break missingId;
      }

      return new ActivityFinalOrderBinding((ConstraintLayout) rootView, btnNewSale, cardFooter,
          consHeaderParent, finalRecycler, finalScroll, ivClosePrint, llTittle, orderId,
          printReceipt, retailOwner, rootPrintView, shareReceipt, tvBikriKorechen, tvDate, tvDue,
          tvHelpline, tvStoreContact, tvStoreName, tvTakaMuller, tvTotalDiscount, tvTotalPaid,
          tvTotalPrice, tvTotalPriceInTittle, tvTotalPriceWithoutDiscount, tvTotalTax,
          tvUserContact, tvUserName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
