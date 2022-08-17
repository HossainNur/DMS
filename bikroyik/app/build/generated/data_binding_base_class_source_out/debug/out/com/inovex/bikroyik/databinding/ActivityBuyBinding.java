// Generated by view binder compiler. Do not edit!
package com.inovex.bikroyik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.inovex.bikroyik.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBuyBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView addExpenseImage;

  @NonNull
  public final Button datePickerButton;

  @NonNull
  public final EditText etExpenseAmount;

  @NonNull
  public final EditText etExpenseDetails;

  @NonNull
  public final Button savebtnId;

  @NonNull
  public final TextView textView;

  private ActivityBuyBinding(@NonNull LinearLayout rootView, @NonNull ImageView addExpenseImage,
      @NonNull Button datePickerButton, @NonNull EditText etExpenseAmount,
      @NonNull EditText etExpenseDetails, @NonNull Button savebtnId, @NonNull TextView textView) {
    this.rootView = rootView;
    this.addExpenseImage = addExpenseImage;
    this.datePickerButton = datePickerButton;
    this.etExpenseAmount = etExpenseAmount;
    this.etExpenseDetails = etExpenseDetails;
    this.savebtnId = savebtnId;
    this.textView = textView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBuyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBuyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_buy, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBuyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_expense_image;
      ImageView addExpenseImage = rootView.findViewById(id);
      if (addExpenseImage == null) {
        break missingId;
      }

      id = R.id.datePickerButton;
      Button datePickerButton = rootView.findViewById(id);
      if (datePickerButton == null) {
        break missingId;
      }

      id = R.id.etExpenseAmount;
      EditText etExpenseAmount = rootView.findViewById(id);
      if (etExpenseAmount == null) {
        break missingId;
      }

      id = R.id.etExpenseDetails;
      EditText etExpenseDetails = rootView.findViewById(id);
      if (etExpenseDetails == null) {
        break missingId;
      }

      id = R.id.savebtnId;
      Button savebtnId = rootView.findViewById(id);
      if (savebtnId == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = rootView.findViewById(id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityBuyBinding((LinearLayout) rootView, addExpenseImage, datePickerButton,
          etExpenseAmount, etExpenseDetails, savebtnId, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}