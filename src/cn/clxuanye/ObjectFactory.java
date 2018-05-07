
package cn.clxuanye;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.clxuanye package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IndexResponse_QNAME = new QName("http://www.clxuanye.cn", "indexResponse");
    private final static QName _GetAllUserResponse_QNAME = new QName("http://www.clxuanye.cn", "getAllUserResponse");
    private final static QName _GetMap_QNAME = new QName("http://www.clxuanye.cn", "getMap");
    private final static QName _GetMapResponse_QNAME = new QName("http://www.clxuanye.cn", "getMapResponse");
    private final static QName _GetAllUser_QNAME = new QName("http://www.clxuanye.cn", "getAllUser");
    private final static QName _Index_QNAME = new QName("http://www.clxuanye.cn", "index");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.clxuanye
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IndexResponse }
     * 
     */
    public IndexResponse createIndexResponse() {
        return new IndexResponse();
    }

    /**
     * Create an instance of {@link GetAllUser }
     * 
     */
    public GetAllUser createGetAllUser() {
        return new GetAllUser();
    }

    /**
     * Create an instance of {@link Index }
     * 
     */
    public Index createIndex() {
        return new Index();
    }

    /**
     * Create an instance of {@link GetMapResponse }
     * 
     */
    public GetMapResponse createGetMapResponse() {
        return new GetMapResponse();
    }

    /**
     * Create an instance of {@link GetAllUserResponse }
     * 
     */
    public GetAllUserResponse createGetAllUserResponse() {
        return new GetAllUserResponse();
    }

    /**
     * Create an instance of {@link GetMap }
     * 
     */
    public GetMap createGetMap() {
        return new GetMap();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.clxuanye.cn", name = "indexResponse")
    public JAXBElement<IndexResponse> createIndexResponse(IndexResponse value) {
        return new JAXBElement<IndexResponse>(_IndexResponse_QNAME, IndexResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.clxuanye.cn", name = "getAllUserResponse")
    public JAXBElement<GetAllUserResponse> createGetAllUserResponse(GetAllUserResponse value) {
        return new JAXBElement<GetAllUserResponse>(_GetAllUserResponse_QNAME, GetAllUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.clxuanye.cn", name = "getMap")
    public JAXBElement<GetMap> createGetMap(GetMap value) {
        return new JAXBElement<GetMap>(_GetMap_QNAME, GetMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMapResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.clxuanye.cn", name = "getMapResponse")
    public JAXBElement<GetMapResponse> createGetMapResponse(GetMapResponse value) {
        return new JAXBElement<GetMapResponse>(_GetMapResponse_QNAME, GetMapResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.clxuanye.cn", name = "getAllUser")
    public JAXBElement<GetAllUser> createGetAllUser(GetAllUser value) {
        return new JAXBElement<GetAllUser>(_GetAllUser_QNAME, GetAllUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Index }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.clxuanye.cn", name = "index")
    public JAXBElement<Index> createIndex(Index value) {
        return new JAXBElement<Index>(_Index_QNAME, Index.class, null, value);
    }

}
