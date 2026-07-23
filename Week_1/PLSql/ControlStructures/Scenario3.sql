SET SERVEROUTPUT ON;

BEGIN
    FOR rec IN (
        SELECT c.Name,
               l.LoanID,
               l.DueDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear'
            || rec.Name
            || ', your Loan ID '
            || rec.LoanID
            || ' is due on '
            || TO_CHAR(rec.DueDate,'DD-MON-YYYY')
        );
    END LOOP;
END;
/