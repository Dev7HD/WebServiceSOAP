
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueApp", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueApp {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "conversionEUR_MAD")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversionEUR_MAD", targetNamespace = "http://ws/", className = "proxy.ConversionEURMAD")
    @ResponseWrapper(localName = "conversionEUR_MADResponse", targetNamespace = "http://ws/", className = "proxy.ConversionEURMADResponse")
    @Action(input = "http://ws/BanqueApp/conversionEUR_MADRequest", output = "http://ws/BanqueApp/conversionEUR_MADResponse")
    public double conversionEURMAD(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listComptes", targetNamespace = "http://ws/", className = "proxy.ListComptes")
    @ResponseWrapper(localName = "listComptesResponse", targetNamespace = "http://ws/", className = "proxy.ListComptesResponse")
    @Action(input = "http://ws/BanqueApp/listComptesRequest", output = "http://ws/BanqueApp/listComptesResponse")
    public List<Compte> listComptes();

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws/", className = "proxy.GetCompteResponse")
    @Action(input = "http://ws/BanqueApp/getCompteRequest", output = "http://ws/BanqueApp/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

}
