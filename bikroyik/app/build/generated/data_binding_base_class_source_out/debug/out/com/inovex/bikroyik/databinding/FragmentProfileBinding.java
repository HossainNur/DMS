// Generated by view binder compiler. Do not edit!
package com.inovex.bikroyik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView distributorName;

  @NonNull
  public final ImageView profileImage;

  @NonNull
  public final TextView reportingContact;

  @NonNull
  public final TextView reportingPerson;

  @NonNull
  public final TextView tvMobileNumber;

  @NonNull
  public final TextView tvProfileDesignation;

  @NonNull
  public final TextView tvProfileName;

  @NonNull
  public final TextView tvUserAddress;

  @NonNull
  public final TextView workingArea;

  @NonNull
  public final TextView workingDivision;

  private FragmentProfileBinding(@NonNull LinearLayout rootView, @NonNull TextView distributorName,
      @NonNull ImageView profileImage, @NonNull TextView reportingContact,
      @NonNull TextView reportingPerson, @NonNull TextView tvMobileNumber,
      @NonNull TextView tvProfileDesignation, @NonNull TextView tvProfileName,
      @NonNull TextView tvUserAddress, @NonNull TextView workingArea,
      @NonNull TextView workingDivision) {
    this.rootView = rootView;
    this.distributorName = distributorName;
    this.profileImage = profileImage;
    this.reportingContact = reportingContact;
    this.reportingPerson = reportingPerson;
    this.tvMobileNumber = tvMobileNumber;
    this.tvProfileDesignation = tvProfileDesignation;
    this.tvProfileName = tvProfileName;
    this.tvUserAddress = tvUserAddress;
    this.workingArea = workingArea;
    this.workingDivision = workingDivision;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.distributorName;
      TextView distributorName = rootView.findViewById(id);
      if (distributorName == null) {
        break missingId;
      }

      id = R.id.profileImage;
      ImageView profileImage = rootView.findViewById(id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.reporting_contact;
      TextView reportingContact = rootView.findViewById(id);
      if (reportingContact == null) {
        break missingId;
      }

      id = R.id.reporting_person;
      TextView reportingPerson = rootView.findViewById(id);
      if (reportingPerson == null) {
        break missingId;
      }

      id = R.id.tvMobileNumber;
      TextView tvMobileNumber = rootView.findViewById(id);
      if (tvMobileNumber == null) {
        break missingId;
      }

      id = R.id.tvProfileDesignation;
      TextView tvProfileDesignation = rootView.findViewById(id);
      if (tvProfileDesignation == null) {
        break missingId;
      }

      id = R.id.tvProfileName;
      TextView tvProfileName = rootView.findViewById(id);
      if (tvProfileName == null) {
        break missingId;
      }

      id = R.id.tvUserAddress;
      TextView tvUserAddress = rootView.findViewById(id);
      if (tvUserAddress == null) {
        break missingId;
      }

      id = R.id.working_area;
      TextView workingArea = rootView.findViewById(id);
      if (workingArea == null) {
        break missingId;
      }

      id = R.id.working_division;
      TextView workingDivision = rootView.findViewById(id);
      if (workingDivision == null) {
        break missingId;
      }

      return new FragmentProfileBinding((LinearLayout) rootView, distributorName, profileImage,
          reportingContact, reportingPerson, tvMobileNumber, tvProfileDesignation, tvProfileName,
          tvUserAddress, workingArea, workingDivision);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
