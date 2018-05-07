package cn.clxuanye;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2018-05-07T12:33:39.948+08:00
 * Generated source version: 2.5.9
 * 
 */
@WebService(targetNamespace = "http://www.clxuanye.cn", name = "CheneyThinkerWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface CheneyThinkerWebService {

    @WebMethod
    @Action(input = "http://www.clxuanye.cn/CheneyThinkerWebService/getMapRequest", output = "http://www.clxuanye.cn/CheneyThinkerWebService/getMapResponse")
    @RequestWrapper(localName = "getMap", targetNamespace = "http://www.clxuanye.cn", className = "cn.clxuanye.GetMap")
    @ResponseWrapper(localName = "getMapResponse", targetNamespace = "http://www.clxuanye.cn", className = "cn.clxuanye.GetMapResponse")
    @WebResult(name = "return", targetNamespace = "")
    public cn.clxuanye.Result getMap();

    @WebMethod
    @Action(input = "http://www.clxuanye.cn/CheneyThinkerWebService/indexRequest", output = "http://www.clxuanye.cn/CheneyThinkerWebService/indexResponse")
    @RequestWrapper(localName = "index", targetNamespace = "http://www.clxuanye.cn", className = "cn.clxuanye.Index")
    @ResponseWrapper(localName = "indexResponse", targetNamespace = "http://www.clxuanye.cn", className = "cn.clxuanye.IndexResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String index();

    @WebMethod
    @Action(input = "http://www.clxuanye.cn/CheneyThinkerWebService/getAllUserRequest", output = "http://www.clxuanye.cn/CheneyThinkerWebService/getAllUserResponse")
    @RequestWrapper(localName = "getAllUser", targetNamespace = "http://www.clxuanye.cn", className = "cn.clxuanye.GetAllUser")
    @ResponseWrapper(localName = "getAllUserResponse", targetNamespace = "http://www.clxuanye.cn", className = "cn.clxuanye.GetAllUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<cn.clxuanye.User> getAllUser();
}