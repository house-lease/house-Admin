package cn.bdqn.controller;

import cn.bdqn.domain.Record;
import cn.bdqn.exception.MyException;
import cn.bdqn.service.RecordService;
import cn.bdqn.utils.Result;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 处理订单请求的controller
 */
@Controller
@RequestMapping("/record")
public class RecordController {

    @Autowired
    private RecordService recordService;

//    /**
//     * 保存订单
//     *
//     * @param record
//     * @return
//     * @throws MyException
//     */
//    @RequestMapping("/save")
//    @ResponseBody
//    public Result save(Record record) throws MyException {
//        Result<Map<String, Object>> results = new Result<>();
//        Map<String, Object> result = new HashMap<>();
//        try {
//            recordService.save(record);
//            result.put("success", "付款成功");
//        } catch (Exception e) {
//            results.setMessage("付款失败去请稍后再试");
//            e.printStackTrace();
//            throw new MyException("付款失败");
//        }
//        results.setData(result);
//        return results;
//    }



    /**
     * 查询订单
     * @param pageCode 页码
     * @param phone 用户手机号
     * @param record 订单号
     * @return

    @RequestMapping("/getRecordList")
    public String getRecordList(int pageRecordList,@RequestParam(defaultValue = "0")Integer pageCode, String phone, String record, Model model) throws MyException {
        Map<String, Object> params = new HashMap<>();
        if (phone != null) {
            params.put("phone", phone);
        }
        if(record != null && !"".equals(record)){
            params.put("record", record);
        }
        params.put("pageCode", pageCode);

        try {
            PageInfo<Record> recordPageInfo =  recordService.queryRecord(params);
            model.addAttribute("recordPageInfo", recordPageInfo);
            model.addAttribute("phone", phone);
            model.addAttribute("record", record);
            model.addAttribute("pageRecordList", pageRecordList);
        }catch(Exception e){
            e.printStackTrace();
            throw new MyException("网络异常");
        }
        return "mainlist";
    }
    */




//    @RequestMapping("/getRecordById")
//    @ResponseBody
//    public Result getRecordById(Integer id) throws MyException {
//        Result result = new Result();
//        try {
//            Record record = recordService.queryRecordById(id);
//            result.setData(record);
//            result.setMessage("success");
//        } catch (Exception e) {
//            e.printStackTrace();
//            result.setMessage("error");
//            throw new MyException("网络异常");
//        }
//        return result;
//    }

   /**
     * 查询订单
     * @param pageCode 页码
     * @param phone 用户手机号
    * @param record 订单号
   */

    @RequestMapping("/getRecordList")
    @ResponseBody
    public Result getRecordList(@RequestParam(defaultValue = "0")Integer pageCode,
                                @RequestParam(required = false)String phone, String record ,
                                @RequestBody Map<String, Object> body) throws MyException {
        pageCode = body.get("pageCode")  ==null  ? pageCode : (Integer) body.get("pageCode") ;
        phone = phone == null ? (String) body.get("phone") : phone;
        record = record == null ? (String) body.get("record") : record;
        Map<String, Object> params = new HashMap<>();
         Result result =new Result();
        if (phone != null) {
            params.put("phone", phone);
        }
        if(record != null && !"".equals(record)){
            params.put("record", record);
        }
        params.put("pageCode", pageCode);

        try {
            PageInfo<Record> recordPageInfo =  recordService.queryRecord(params);
            result.put("recordPageInfo", recordPageInfo);
            result.put("phone", phone);
            result.put("record", record);
            result.put("message","success");
        }catch(Exception e){
            e.printStackTrace();
            throw new MyException("网络异常");
        }
        return result;
    }

}
