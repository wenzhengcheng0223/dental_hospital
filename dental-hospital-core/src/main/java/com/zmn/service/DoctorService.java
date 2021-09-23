package com.zmn.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmn.mapper.DoctorMapper;
import com.zmn.entity.Doctor;
/**
 * @Description : 
 * @Author : WenZhengcheng
 * @Date : Create in 2021/9/23 上午 01:03
 * @Email : wenzhengcheng0223@163.com
 * @Since : JDK 1.8
 * @PackageName : com.zmn.service
 * @ProjectName : DentalHospital
 * @Version : 1.0.0
 */

@Service
public class DoctorService extends ServiceImpl<DoctorMapper, Doctor> {

}
