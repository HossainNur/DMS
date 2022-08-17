package com.inovex.bikroyik.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DueResponseModel {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("statusCode")
    @Expose
    private Integer statusCode;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("data")
    @Expose
    private List<DueModel> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<DueModel> getData() {
        return data;
    }

    public void setData(List<DueModel> data) {
        this.data = data;
    }

    public class DueModel{
        @SerializedName("clientName")
        @Expose
        private String clientName;
        @SerializedName("mobile")
        @Expose
        private String mobile;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("note")
        @Expose
        private String note;
        @SerializedName("storeId")
        @Expose
        private String storeId;
        @SerializedName("image")
        @Expose
        private String image;
        @SerializedName("subscriber_id")
        @Expose
        private String subscriberId;
        @SerializedName("payments")
        @Expose
        private List<DuePaymentModel> payments = null;

        public String getClientName() {
            return clientName;
        }

        public void setClientName(String clientName) {
            this.clientName = clientName;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

        public String getStoreId() {
            return storeId;
        }

        public void setStoreId(String storeId) {
            this.storeId = storeId;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getSubscriberId() {
            return subscriberId;
        }

        public void setSubscriberId(String subscriberId) {
            this.subscriberId = subscriberId;
        }

        public List<DuePaymentModel> getPayments() {
            return payments;
        }

        public void setPayments(List<DuePaymentModel> payments) {
            this.payments = payments;
        }
    }

    public class DuePaymentModel{
        @SerializedName("total")
        @Expose
        private String total;
        @SerializedName("due")
        @Expose
        private String due;
        @SerializedName("created_at")
        @Expose
        private String createdAt;

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public String getDue() {
            return due;
        }

        public void setDue(String due) {
            this.due = due;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }
    }

}
