// Generated by view binder compiler. Do not edit!
package com.inovex.bikroyik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.inovex.bikroyik.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AttendanceListRowBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout llAttendanceRow;

  @NonNull
  public final TextView tvAttendanceDate;

  @NonNull
  public final TextView tvAttendanceIn;

  @NonNull
  public final TextView tvAttendanceOut;

  @NonNull
  public final TextView tvAttendanceStatus;

  private AttendanceListRowBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout llAttendanceRow, @NonNull TextView tvAttendanceDate,
      @NonNull TextView tvAttendanceIn, @NonNull TextView tvAttendanceOut,
      @NonNull TextView tvAttendanceStatus) {
    this.rootView = rootView;
    this.llAttendanceRow = llAttendanceRow;
    this.tvAttendanceDate = tvAttendanceDate;
    this.tvAttendanceIn = tvAttendanceIn;
    this.tvAttendanceOut = tvAttendanceOut;
    this.tvAttendanceStatus = tvAttendanceStatus;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AttendanceListRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AttendanceListRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.attendance_list_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AttendanceListRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.llAttendanceRow;
      LinearLayout llAttendanceRow = rootView.findViewById(id);
      if (llAttendanceRow == null) {
        break missingId;
      }

      id = R.id.tvAttendanceDate;
      TextView tvAttendanceDate = rootView.findViewById(id);
      if (tvAttendanceDate == null) {
        break missingId;
      }

      id = R.id.tvAttendanceIn;
      TextView tvAttendanceIn = rootView.findViewById(id);
      if (tvAttendanceIn == null) {
        break missingId;
      }

      id = R.id.tvAttendanceOut;
      TextView tvAttendanceOut = rootView.findViewById(id);
      if (tvAttendanceOut == null) {
        break missingId;
      }

      id = R.id.tvAttendanceStatus;
      TextView tvAttendanceStatus = rootView.findViewById(id);
      if (tvAttendanceStatus == null) {
        break missingId;
      }

      return new AttendanceListRowBinding((LinearLayout) rootView, llAttendanceRow,
          tvAttendanceDate, tvAttendanceIn, tvAttendanceOut, tvAttendanceStatus);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
