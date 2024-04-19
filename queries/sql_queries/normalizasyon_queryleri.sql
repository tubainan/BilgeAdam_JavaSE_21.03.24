INSERT INTO public.tbl_customer_orders(
	 customer_name, customer_email, order_id, order_date, order_total_amount)
	VALUES ('tuba', 'tuba@gmail.com',3, 12374891589, 1753.65);
	
SELECT * FROM tbl_customer_orders;

INSERT INTO public.tbl_customer(
    customer_name, customer_email)
    VALUES ('Ahmet','Ahmet@gmail.com');
	
SELECT * FROM tbl_customer;

INSERT INTO public.tbl_orders(
   order_date, order_total_amount,customer_id)
    VALUES (123456965,17587.67,4);
	
SELECT * FROM tbl_orders;

	