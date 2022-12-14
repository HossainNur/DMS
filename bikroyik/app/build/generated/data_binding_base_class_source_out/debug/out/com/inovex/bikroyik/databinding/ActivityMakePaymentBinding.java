// Generated by view binder compiler. Do not edit!
package com.inovex.bikroyik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.inovex.bikroyik.R;
import com.jaredrummler.materialspinner.MaterialSpinner;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMakePaymentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnChargeMakePayment;

  @NonNull
  public final ChildContactBinding customerView;

  @NonNull
  public final EditText etCardPayment;

  @NonNull
  public final EditText etMobileBankingPayment;

  @NonNull
  public final EditText etTotalAmount;

  @NonNull
  public final View footerView;

  @NonNull
  public final LinearLayout llBtnCardPayment;

  @NonNull
  public final LinearLayout llBtnCashPayment;

  @NonNull
  public final LinearLayout llMobileBanking;

  @NonNull
  public final MaterialSpinner spinnerMobileBanking;

  @NonNull
  public final ToolbarMakePaymentBinding toolbar;

  @NonNull
  public final TextView tvDueText;

  @NonNull
  public final TextView tvTotalAmount;

  private ActivityMakePaymentBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnChargeMakePayment, @NonNull ChildContactBinding customerView,
      @NonNull EditText etCardPayment, @NonNull EditText etMobileBankingPayment,
      @NonNull EditText etTotalAmount, @NonNull View footerView,
      @NonNull LinearLayout llBtnCardPayment, @NonNull LinearLayout llBtnCashPayment,
      @NonNull LinearLayout llMobileBanking, @NonNull MaterialSpinner spinnerMobileBanking,
      @NonNull ToolbarMakePaymentBinding toolbar, @NonNull TextView tvDueText,
      @NonNull TextView tvTotalAmount) {
    this.rootView = rootView;
    this.btnChargeMakePayment = btnChargeMakePayment;
    this.customerView = customerView;
    this.etCardPayment = etCardPayment;
    this.etMobileBankingPayment = etMobileBankingPayment;
    this.etTotalAmount = etTotalAmount;
    this.footerView = footerView;
    this.llBtnCardPayment = llBtnCardPayment;
    this.llBtnCashPayment = llBtnCashPayment;
    this.llMobileBanking = llMobileBanking;
    this.spinnerMobileBanking = spinnerMobileBanking;
    this.toolbar = toolbar;
    this.tvDueText = tvDueText;
    this.tvTotalAmount = tvTotalAmount;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMakePaymentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMakePaymentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_make_payment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMakePaymentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_charge_makePayment;
      Button btnChargeMakePayment = rootView.findViewById(id);
      if (btnChargeMakePayment == null) {
        break missingId;
      }

      id = R.id.customer_view;
      View customerView = rootView.findViewById(id);
      if (customerView == null) {
        break missingId;
      }
      ChildContactBinding binding_customerView = ChildContactBinding.bind(customerView);

      id = R.id.et_cardPayment;
      EditText etCardPayment = rootView.findViewById(id);
      if (etCardPayment == null) {
        break missingId;
      }

      id = R.id.et_mobileBankingPayment;
      EditText etMobileBankingPayment = rootView.findViewById(id);
      if (etMobileBankingPayment == null) {
        break missingId;
      }

      id = R.id.et_totalAmount;
      EditText etTotalAmount = rootView.findViewById(id);
      if (etTotalAmount == null) {
        break missingId;
      }

      id = R.id.footer_View;
      View footerView = rootView.findViewById(id);
      if (footerView == null) {
        break missingId;
      }

      id = R.id.ll_btn_cardPayment;
      LinearLayout llBtnCardPayment = rootView.findViewById(id);
      if (llBtnCardPayment == null) {
        break missingId;
      }

      id = R.id.ll_btn_cashPayment;
      LinearLayout llBtnCashPayment = rootView.findViewById(id);
      if (llBtnCashPayment == null) {
        break missingId;
      }

      id = R.id.ll_mobileBanking;
      LinearLayout llMobileBanking = rootView.findViewById(id);
      if (llMobileBanking == null) {
        break missingId;
      }

      id = R.id.spinner_mobileBanking;
      MaterialSpinner spinnerMobileBanking = rootView.findViewById(id);
      if (spinnerMobileBanking == null) {
        break missingId;
      }

      id = R.id.toolbar;
      View toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }
      ToolbarMakePaymentBinding binding_toolbar = ToolbarMakePaymentBinding.bind(toolbar);

      id = R.id.tv_dueText;
      TextView tvDueText = rootView.findViewById(id);
      if (tvDueText == null) {
        break missingId;
      }

      id = R.id.tv_total_amount;
      TextView tvTotalAmount = rootView.findViewById(id);
      if (tvTotalAmount == null) {
        break missingId;
      }

      return new ActivityMakePaymentBinding((ConstraintLayout) rootView, btnChargeMakePayment,
          binding_customerView, etCardPayment, etMobileBankingPayment, etTotalAmount, footerView,
          llBtnCardPayment, llBtnCashPayment, llMobileBanking, spinnerMobileBanking,
          binding_toolbar, tvDueText, tvTotalAmount);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
