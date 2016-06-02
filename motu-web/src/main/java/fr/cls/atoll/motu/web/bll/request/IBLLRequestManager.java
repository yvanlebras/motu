package fr.cls.atoll.motu.web.bll.request;

import java.util.List;

import fr.cls.atoll.motu.api.message.xml.StatusModeResponse;
import fr.cls.atoll.motu.library.misc.exception.MotuExceptionBase;
import fr.cls.atoll.motu.web.bll.request.model.ExtractionParameters;
import fr.cls.atoll.motu.web.bll.request.model.ProductResult;
import fr.cls.atoll.motu.web.bll.request.model.RequestDownloadStatus;
import fr.cls.atoll.motu.web.bll.request.queueserver.QueueServerManagement;
import fr.cls.atoll.motu.web.dal.config.xml.model.ConfigService;
import fr.cls.atoll.motu.web.dal.request.netcdf.data.Product;

/**
 * <br>
 * <br>
 * Copyright : Copyright (c) 2016 <br>
 * <br>
 * Société : CLS (Collecte Localisation Satellites)
 * 
 * @author Sylvain MARTY
 * @version $Revision: 1.1 $ - $Date: 2007-05-22 16:56:28 $
 */
public interface IBLLRequestManager {

    /**
     * .
     * 
     * @return
     */
    List<Long> getRequestIds();

    /**
     * .
     * 
     * @param requestId
     * @return
     */
    RequestDownloadStatus getResquestStatus(Long requestId_);

    /**
     * .
     * 
     * @return
     */
    long getNewRequestId();

    /**
     * .
     * 
     * @param extractionParameters
     * @return
     */
    StatusModeResponse processRequest(ExtractionParameters extractionParameters);

    /**
     * This method retrieve the size of the data of a product.
     * 
     * @param extractionParameters This is the parameters which identify the data of the targeted product.
     * @return The size of the product into KiloByte
     */
    double processProductDataSize(Product product,
                                  List<String> listVar,
                                  List<String> listTemporalCoverage,
                                  List<String> listLatLongCoverage,
                                  List<String> listDepthCoverage) throws MotuExceptionBase;

    /**
     * This method retrieve the Max Allowed Data size of a product.
     * 
     * @param extractionParameters This is the parameters which identify the data of the targeted product.
     * @return The Max Allowed Data size of the product into KiloByte
     */
    double processProductMaxAllowedDataSize(Product product) throws MotuExceptionBase;

    /**
     * .
     * 
     * @param extractionParameters
     * @return
     */
    double getAmountDataSizeAsMBytes(ExtractionParameters extractionParameters);

    /**
     * Return the QueueServerManagement object
     * 
     * @return The QueueServerManagement Object.
     */
    QueueServerManagement getQueueServerManager();

    /**
     * .
     * 
     * @param cs_
     * @param product_
     * @param extractionParameters
     * @return
     */
    ProductResult download(ConfigService cs_, Product product_, ExtractionParameters extractionParameters);

    /**
     * .
     * 
     * @param cs_
     * @param product_
     * @param extractionParameters
     * @return
     */
    long downloadAsynchonously(ConfigService cs_, Product product_, ExtractionParameters extractionParameters);

}
