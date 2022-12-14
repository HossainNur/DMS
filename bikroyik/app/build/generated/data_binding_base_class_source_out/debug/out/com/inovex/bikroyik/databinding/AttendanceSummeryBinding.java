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

public final class AttendanceSummeryBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView tvAbsent;

  @NonNull
  public final TextView tvAttendanceNull;

  @NonNull
  public final TextView tvEarlyOut;

  @NonNull
  public final TextView tvLateIn;

  @NonNull
  public final TextView tvLeaveAttendance;

  @NonNull
  public final TextView tvPresent;

  private AttendanceSummeryBinding(@NonNull LinearLayout rootView, @NonNull TextView tvAbsent,
      @NonNull TextView tvAttendanceNull, @NonNull TextView tvEarlyOut, @NonNull TextView tvLateIn,
      @NonNull TextView tvLeaveAttendance, @NonNull TextView tvPresent) {
    this.rootView = rootView;
    this.tvAbsent = tvAbsent;
    this.tvAttendanceNull = tvAttendanceNull;
    this.tvEarlyOut = tvEarlyOut;
    this.tvLateIn = tvLateIn;
    this.tvLeaveAttendance = tvLeaveAttendance;
    this.tvPresent = tvPresent;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AttendanceSummeryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AttendanceSummeryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.attendance_summery, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AttendanceSummeryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tvAbsent;
      TextView tvAbsent = rootView.findViewById(id);
      if (tvAbsent == null) {
        break missingId;
      }

      id = R.id.tvAttendanceNull;
      TextView tvAttendanceNull = rootView.findViewById(id);
      if (tvAttendanceNull == null) {
        break missingId;
      }

      id = R.id.tvEarlyOut;
      TextView tvEarlyOut = rootView.findViewById(id);
      if (tvEarlyOut == null) {
        break missingId;
      }

      id = R.id.tvLateIn;
      TextView tvLateIn = rootView.findViewById(id);
      if (tvLateIn == null) {
        break missingId;
      }

      id = R.id.tvLeaveAttendance;
      TextView tvLeaveAttendance = rootView.findViewById(id);
      if (tvLeaveAttendance == null) {
        break missingId;
      }

      id = R.id.tvPresent;
      TextView tvPresent = rootView.findViewById(id);
      if (tvPresent == null) {
        break missingId;
      }

      return new AttendanceSummeryBinding((LinearLayout) rootView, tvAbsent, tvAttendanceNull,
          tvEarlyOut, tvLateIn, tvLeaveAttendance, tvPresent);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
