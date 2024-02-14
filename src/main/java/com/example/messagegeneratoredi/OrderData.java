package com.example.messagegeneratoredi;


public class OrderData {
    private String userAbbreviation;
    private String orgCode;
    private String mailPartner;
    private String  sellerNo;
    private String plantCode;
    private boolean today;
    private boolean tomorrow;

    public String getUserAbbreviation() {
        return userAbbreviation;
    }

    public void setUserAbbreviation(String userAbbreviation) {
        this.userAbbreviation = userAbbreviation;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getMailPartner() {
        return mailPartner;
    }

    public void setMailPartner(String mailPartner) {
        this.mailPartner = mailPartner;
    }

    public String getSellerNo() {
        return sellerNo;
    }

    public void setSellerNo(String sellerNo) {
        this.sellerNo = sellerNo;
    }

    public String getPlantCode() {
        return plantCode;
    }

    public void setPlantCode(String plantCode) {
        this.plantCode = plantCode;
    }

    public boolean isToday() {
        return today;
    }

    public void setToday(boolean today) {
        this.today = today;
    }

    public boolean isTomorrow() {
        return tomorrow;
    }

    public void setTomorrow(boolean tomorrow) {
        this.tomorrow = tomorrow;
    }

    public OrderData() {
    }

    @Override
    public String toString() {
        return "OrderData{" +
                "userAbbreviation='" + userAbbreviation + '\'' +
                ", orgCode='" + orgCode + '\'' +
                ", mailPartner='" + mailPartner + '\'' +
                ", sellerNo='" + sellerNo + '\'' +
                ", plantCode='" + plantCode + '\'' +
                ", today=" + today +
                ", tomorrow=" + tomorrow +
                '}'

                ;
    }


}
