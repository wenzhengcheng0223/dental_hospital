package com.zmn.controller;

import com.zmn.entity.Img;
import com.zmn.service.ImgService;
import com.zmn.utils.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description :
 * @Author : WenZhengcheng
 * @Date : Create in 2021/9/24 上午 11:29
 * @Email : wenzhengcheng0223@163.com
 * @Since : JDK 1.8
 * @PackageName : com.zmn.controller
 * @ProjectName : DentalHospital
 * @Version : 1.0.0
 */

@RestController
@RequestMapping("/api/img")
public class ImgController {

    private final ImgService service;
    ImgController(ImgService service){
        this.service = service;
    }

    @GetMapping("/select")
    public R selectAll(){
        List<Img> list = service.list();
        if (!list.isEmpty()) {
            return R.ok().message("查询成功").data("list",list);
        }

        return R.error().message("查询失败");
    }


    @PostMapping("/save")
    @ApiOperation(value = "save", notes = "save")
    public R save(@RequestBody Img img){
        boolean save = service.save(img);

        if (save) {
            return R.ok().message("添加成功");
        }

        return R.error().message("添加失败");
    }

    @PostMapping("/update")
    @ApiOperation(value = "update", notes = "update")
    public R update(@RequestBody Img img){
        System.out.println(img.getId());
        boolean update = service.updateById(img);
        if (update){
            return R.ok().message("更新成功").data(null);
        }
        return R.error().message("更新失败").data(null);
    }


    @GetMapping("/delete")
    @ApiOperation(value = "delete", notes = "delete")
    public R delete(@RequestParam String id){
        boolean remove = service.removeById(id);
        if (remove) {
            return R.ok().message("删除成功");
        }

        return R.error().message("删除失败");
    }

}
