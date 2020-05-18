package cn.bdqn.domain;

import org.springframework.stereotype.Component;

import java.beans.Transient;

/**
 * 城市对象
 */
@Component
public class Address {

    //城市id
    private Integer id;

    //城市名
    private String address;

    private Integer parentId;

    //父级id
    private Address parentAddress;

    //城市的状态 0正常 1删除'
    private Integer state;

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Address getParentAddress() {
        return parentAddress;
    }

    public void setParentAddress(Address parentAddress) {
        this.parentAddress = parentAddress;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", parentId=" + parentId +
                ", parentAddress=" + parentAddress +
                ", state=" + state +
                '}';
    }
}