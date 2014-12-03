/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import models.*;

/**
 *
 * @author tan
 */
public class Database {
    public static EntityManagerFactory EMF;
    private static List<Item> itemList;
    private static List<Supplier> supplierList;
    private static List<Category> categoryList;
    private static List<Department> departmentList;
    private static List<PurchaseRequest> requestList;

    /**
     * @return the itemList
     */
    public static List<Item> getItemList() {
        return itemList;
    }

    /**
     * @return the supplierList
     */
    public static List<Supplier> getSupplierList() {
        return supplierList;
    }

    /**
     * @return the categoryList
     */
    public static List<Category> getCategoryList() {
        return categoryList;
    }

    /**
     * @return the departmentList
     */
    public static List<Department> getDepartmentList() {
        return departmentList;
    }
    
    public Database(){
        EMF = Persistence.createEntityManagerFactory("InventoryPersistence");
        loadDatabase();
    }
    
    private void loadDatabase(){
        EntityManager em = EMF.createEntityManager();
        TypedQuery items = em.createQuery("SELECT I FROM Item I", Item.class);
        itemList = items.getResultList();
        Query suppliers = em.createNativeQuery("SELECT * FROM SUPPLIER", Supplier.class);
        supplierList = suppliers.getResultList();
        Query categories = em.createNativeQuery("SELECT * FROM CATEGORY", Category.class);
        categoryList = categories.getResultList();
        Query departments = em.createNativeQuery("SELECT * FROM DEPARTMENT", Department.class);
        departmentList = departments.getResultList();
        TypedQuery requests = em.createQuery("SELECT R FROM PurchaseRequest R", PurchaseRequest.class);
        requestList = requests.getResultList();
    }
}
