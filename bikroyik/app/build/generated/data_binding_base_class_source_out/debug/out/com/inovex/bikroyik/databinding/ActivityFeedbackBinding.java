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

public final class ActivityFeedbackBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView etCourse;

  @NonNull
  public final TextView etFeetback;

  @NonNull
  public final TextView etSection;

  @NonNull
  public final TextView etSemester;

  @NonNull
  public final TextView etStudentId;

  @NonNull
  public final TextView etStudentName;

  @NonNull
  public final TextView simpleRatingBar;

  private ActivityFeedbackBinding(@NonNull LinearLayout rootView, @NonNull TextView etCourse,
      @NonNull TextView etFeetback, @NonNull TextView etSection, @NonNull TextView etSemester,
      @NonNull TextView etStudentId, @NonNull TextView etStudentName,
      @NonNull TextView simpleRatingBar) {
    this.rootView = rootView;
    this.etCourse = etCourse;
    this.etFeetback = etFeetback;
    this.etSection = etSection;
    this.etSemester = etSemester;
    this.etStudentId = etStudentId;
    this.etStudentName = etStudentName;
    this.simpleRatingBar = simpleRatingBar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFeedbackBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFeedbackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_feedback, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFeedbackBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.et_course;
      TextView etCourse = rootView.findViewById(id);
      if (etCourse == null) {
        break missingId;
      }

      id = R.id.et_feetback;
      TextView etFeetback = rootView.findViewById(id);
      if (etFeetback == null) {
        break missingId;
      }

      id = R.id.et_section;
      TextView etSection = rootView.findViewById(id);
      if (etSection == null) {
        break missingId;
      }

      id = R.id.et_Semester;
      TextView etSemester = rootView.findViewById(id);
      if (etSemester == null) {
        break missingId;
      }

      id = R.id.et_studentId;
      TextView etStudentId = rootView.findViewById(id);
      if (etStudentId == null) {
        break missingId;
      }

      id = R.id.et_studentName;
      TextView etStudentName = rootView.findViewById(id);
      if (etStudentName == null) {
        break missingId;
      }

      id = R.id.simpleRatingBar;
      TextView simpleRatingBar = rootView.findViewById(id);
      if (simpleRatingBar == null) {
        break missingId;
      }

      return new ActivityFeedbackBinding((LinearLayout) rootView, etCourse, etFeetback, etSection,
          etSemester, etStudentId, etStudentName, simpleRatingBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}