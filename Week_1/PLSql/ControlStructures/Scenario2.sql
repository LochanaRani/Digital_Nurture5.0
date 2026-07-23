SET SERVEROUTPUT ON;

BEGIN
    FOR rec IN (
        SELECT CustomerID, Balance
        FROM Customers
    )
    LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('VIP customers updated successfully.');
END;
/