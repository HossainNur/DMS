// Generated by view binder compiler. Do not edit!
package com.inovex.bikroyik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.inovex.bikroyik.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTargetBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView targetRecycler;

  @NonNull
  public final ToolbarMeetingBinding tbToolbarMeeting;

  @NonNull
  public final TextView tvSaleQty;

  @NonNull
  public final TextView tvSaleValues;

  @NonNull
  public final TextView tvTargetQty;

  @NonNull
  public final TextView tvTargetValues;

  private ActivityTargetBinding(@NonNull LinearLayout rootView,
      @NonNull RecyclerView targetRecycler, @NonNull ToolbarMeetingBinding tbToolbarMeeting,
      @NonNull TextView tvSaleQty, @NonNull TextView tvSaleValues, @NonNull TextView tvTargetQty,
      @NonNull TextView tvTargetValues) {
    this.rootView = rootView;
    this.targetRecycler = targetRecycler;
    this.tbToolbarMeeting = tbToolbarMeeting;
    this.tvSaleQty = tvSaleQty;
    this.tvSaleValues = tvSaleValues;
    this.tvTargetQty = tvTargetQty;
    this.tvTargetValues = tvTargetValues;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTargetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTargetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_target, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTargetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.target_recycler;
      RecyclerView targetRecycler = rootView.findViewById(id);
      if (targetRecycler == null) {
        break missingId;
      }

      id = R.id.tbToolbarMeeting;
      View tbToolbarMeeting = rootView.findViewById(id);
      if (tbToolbarMeeting == null) {
        break missingId;
      }
      ToolbarMeetingBinding binding_tbToolbarMeeting = ToolbarMeetingBinding.bind(tbToolbarMeeting);

      id = R.id.tvSaleQty;
      TextView tvSaleQty = rootView.findViewById(id);
      if (tvSaleQty == null) {
        break missingId;
      }

      id = R.id.tvSaleValues;
      TextView tvSaleValues = rootView.findViewById(id);
      if (tvSaleValues == null) {
        break missingId;
      }

      id = R.id.tvTargetQty;
      TextView tvTargetQty = rootView.findViewById(id);
      if (tvTargetQty == null) {
        break missingId;
      }

      id = R.id.tvTargetValues;
      TextView tvTargetValues = rootView.findViewById(id);
      if (tvTargetValues == null) {
        break missingId;
      }

      return new ActivityTargetBinding((LinearLayout) rootView, targetRecycler,
          binding_tbToolbarMeeting, tvSaleQty, tvSaleValues, tvTargetQty, tvTargetValues);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
