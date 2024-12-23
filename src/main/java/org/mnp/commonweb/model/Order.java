package org.mnp.commonweb.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {
    /** Id of the order filed */
    private String orderId;
    /** Id of the customer */
    private String customerId;
    /** Id of the supplier */
    private String supplierId;
    /** First Name of Customer */
    private String firstName;
    /** Last Name of Customer */
    private String lastName;
    /** Totla number of items in the order */
    private int items;
    /** Total price of the order */
    private double price;
    /** Weight of the items */
    private double weight;
    /** Field indicating if the user is enrolled in marketing emails */
    private boolean automatedEmail;
}
