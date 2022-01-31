package org.training.trainingcommercewebservices.v2.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.training.facades.product.data.SupplierData;
import org.training.facades.product.data.UserData;
import org.training.facades.supplier.facade.TrainingSupplierFacade;
import org.training.facades.user.facade.TrainingUserFacade;

import javax.annotation.Resource;

@Controller
@RequestMapping(value="/{baseSiteId}")
public class CommonControllers extends BaseController{

    @Resource(name="trainingUserFacade")
    private TrainingUserFacade trainingUserFacade;
    @Resource(name="trainingSupplierFacade")
    private TrainingSupplierFacade trainingSupplierFacade;

    @RequestMapping(value="/hello-world", method = RequestMethod.GET)
    @ResponseBody
    public String getHelloWorld(){
        return "hello world!";
    }

    @RequestMapping(value="/get-user/{email}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> getUserByEmail(@PathVariable final String email){
        UserData userData = trainingUserFacade.getUserByEmail(email);

        if(userData == null){
            return new ResponseEntity<String>("User not found", HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<UserData>(userData, HttpStatus.OK);
        }
    }

    @RequestMapping(value="/get-supplier", method = RequestMethod.GET)
    @ResponseBody
    public <supplierData> ResponseEntity<?> getSupplier(){
        SupplierData supplierData = (SupplierData) trainingSupplierFacade.getSupplier();
        if(supplierData == null){
            return new ResponseEntity<String>("User not found", HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<supplierData>((supplierData) supplierData, HttpStatus.OK);
        }
    }
}
