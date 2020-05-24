package com.sda.post.office;

public enum PackageStatus {
  SENT("Package has been sent", 300) {
    @Override
    public PackageStatus nextStatus() {
      return TRAVELLING;
    }
  },
  TRAVELLING("Package is travelling between cities", 301) {
    @Override
    public PackageStatus nextStatus() {
      return COURIER;
    }
  },
  COURIER("Package is being delivered", 302) {
    @Override
    public PackageStatus nextStatus() {
      return DELIVERED;
    }
  },
  DELIVERED("Package has been delivered", 200) {
    @Override
    public PackageStatus nextStatus() {
      return null;
    }
  },
  LOST("Package has been lost", 500) {
    @Override
    public PackageStatus nextStatus() {
      return null;
    }
  },
  RETURNED("Package has been returned to sender", 303) {
    @Override
    public PackageStatus nextStatus() {
      return null;
    }
  };

  private final String description;
  private final int statusCode;

  PackageStatus(String description, int statusCode) {
    this.description = description;
    this.statusCode = statusCode;
  }

  public String getDescription() {
    return description;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public abstract PackageStatus nextStatus();
}
