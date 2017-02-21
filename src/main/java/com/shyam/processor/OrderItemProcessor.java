/**
 * 
 */
package com.shyam.processor;

import org.springframework.batch.item.ItemProcessor;

import com.shyam.beans.Order;
import com.shyam.beans.SvcReq;

/**
 * @author svadikari
 *
 */
public class OrderItemProcessor implements ItemProcessor<Order, SvcReq> {
    
    @Override
    public SvcReq process(final Order order) throws Exception {
      
        final SvcReq svcReq = new SvcReq();
        
        svcReq.setId(order.getOrderID());
        svcReq.setName(order.getOrderName().toUpperCase());

        System.out.println("Converting (" + order + ") into (" + svcReq + ")");

        return svcReq;
    }

}
