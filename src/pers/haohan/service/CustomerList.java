package pers.haohan.service;

import pers.haohan.bean.Customer;

public class CustomerList {
    private Customer[] customers;          // 用来保存客户对象的数组
    private int total = 0;                 // 记录已保存客户对象的数量

    /**
     * 用途：构造器，用来初始化customers数组
     * 参数：totalCustomer：指定customers数组的最大空间
     *
     * @param totalCustomer
     */
    public CustomerList(int totalCustomer) {

        customers = new Customer[totalCustomer];

    }

    /**
     * 将指定的客户添加到数组中
     *
     * @param customer
     * @return true:添加成功 false：添加失败
     */
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        }
        customers[total] = customer;
        total++;
        return true;
    }

    /**
     * 修改指定索引位置的客戶信息
     *
     * @param index
     * @param cust
     * @return
     */
    public boolean replaceCustomer(int index, Customer cust) {

        if (index < 0 || index >= total) {
            return false;
        }

        customers[index] = cust;
        return true;
    }

    /**
     * 刪除指定索引上的客戶
     *
     * @param index
     * @return
     */
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }

        // 最后有数据的元素需要置空
        customers[--total] = null;
        return true;
    }

    /**
     * 获取所有客户信息
     * @return
     */
    public Customer[] getAllCustomers() {
        Customer[] custs = new Customer[total];

        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }

        return custs;
    }

    /**
     * 获取指定索引位置上的客户
     *
     * @param index
     * @return
     */
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];
    }

    /**
     * 获取存储的客户数量
     *
     * @return
     */
    public int getTotal() {
        return total;
    }


}
