package com.st.mybatis.po;

public class Orderdetail {
    private String id;

    private String ordersId;

    private String itemsId;

    private String itemsNum;
    
    //明细对应的商品信息
    private Items items;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId;
    }

    public String getItemsId() {
        return itemsId;
    }

    public void setItemsId(String itemsId) {
        this.itemsId = itemsId;
    }

    public String getItemsNum() {
        return itemsNum;
    }

    public void setItemsNum(String itemsNum) {
        this.itemsNum = itemsNum;
    }

    public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Orderdetail [id=" + id + ", ordersId=" + ordersId
				+ ", itemsId=" + itemsId + ", itemsNum=" + itemsNum + "]";
	}
    
}