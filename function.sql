DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `user_insert_procedure`(IN email VARCHAR(45),IN username VARCHAR(45),OUT is_ok Bool)
BEGIN	
    IF check_user_function(email,username) = 0 
    THEN set is_ok = true;
	ELSE set is_ok = false;
    END IF;	
END$$
DELIMITER ;
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `test_procedure`()
BEGIN
select * from user;
END$$
DELIMITER ;
DELIMITER $$
CREATE DEFINER=`root`@`localhost` FUNCTION `check_user_function`(email VARCHAR(45),username VARCHAR(45)) RETURNS int(11)
BEGIN
DECLARE isUserName INT(11);
DECLARE isEmail INT(11);
DECLARE value_return INT(11);
	set value_return = 0;
	set isUserName = (SELECT count(*) FROM user WHERE user.userName = username);
    set isEmail = (SELECT count(*) FROM user WHERE user.email = email);
    IF isUserName >0 THEN 
		set value_return = isUserName;
	else
		IF isEmail >0 THEN 
			set value_return = isEmail;
		END IF;
	END IF;
		
RETURN value_return;
END$$
DELIMITER ;
