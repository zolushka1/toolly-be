package com.pi.toolly.repository;

import com.pi.toolly.entity.Item;
import org.springframework.stereotype.Repository;

@Repository
public interface IItemCountRepository extends MainRepository<Item, Long> {
//    @Query("select a from Items a where a.code = :code")
//    Items getItemByCode(@Param("code") String code);
//
//    @Query("select new octagon.retail.model.item.CompleteItemModel(a.id, a.code, a.name, supplier.name, group.name, measure.name, a.isVat, a.isCityTax, a.isActive) "
//            +
//            "from Items a " +
//            "left join Supplier supplier on a.supplierId = supplier.id " +
//            "left join ItemGroups group on a.itemGroupId = group.id " +
//            "left join Measures measure on a.measureId = measure.id")
//    List<CompleteItemModel> getCompleteItemList();
}
