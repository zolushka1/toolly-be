package com.pi.toolly.controller;

import com.pi.toolly.service.ItemCountService;
import com.pi.toolly.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itemcount")
@CrossOrigin(origins = "*")
public class ItemCountController {

    @Autowired
    private ItemCountService itemCountService;

//    @PostMapping("save-item")
//    public ResponseEntity<ResponseModel<ItemModel>> saveItemPrice(@RequestBody @Valid ItemModel item) {
//        return itemService.saveItem(item);
//    }
//
//    @PostMapping("update-item")
//    public ResponseEntity<ResponseModel<ItemModel>> getAllItemPrice(@RequestBody @Valid ItemModel item) {
//        return itemService.updateItem(item);
//    }
//
//    @GetMapping("/complete")
//    public ResponseEntity<ResponseModel<List<CompleteItemModel>>> getAllItemDatas() {
//        return itemService.getCompleteItemDatas();
//    }
//
//    @GetMapping("get-all-items")
//    public ResponseEntity<ResponseModel<List<ItemModel>>> getAllByItemId() {
//        return itemService.getAllItems();
//    }
//
//    @GetMapping("get-item-by-id")
//    public ResponseEntity<ResponseModel<ItemModel>> getItemById(@RequestParam("id") Long itemId) {
//        return itemService.getItemById(itemId);
//    }
//
//    @GetMapping("get-item-by-code")
//    public ResponseEntity<ResponseModel<ItemModel>> getItemByCode(@RequestParam("code") String code) {
//        return itemService.getItemByCode(code);
//    }
//
//    @PostMapping("delete-item-by-id")
//    public ResponseEntity<ResponseModel<Items>> DeleteAllByItemId(@RequestParam("id") Long itemId) {
//        return itemService.deleteItemById(itemId);
//    }
}
