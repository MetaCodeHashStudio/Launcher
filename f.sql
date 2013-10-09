
SELECT aNickname,aPassword,aEmail,aGender,aDate,aLvl,aGold,aXP FROM metaAcc,yahtzoid
ORDER BY aNickname,aPassword,aEmail,aGender,aDate,aLvl,aGold,aXP DESC;

SELECT AES_DECRYPT('good','kk') FROM metaAcc;


SELECT * FROM metaAcc;
SELECT * FROM yahtzoid;

CREATE TABLE metaAcc
(
accID int(1) not null unique AUTO_INCREMENT,
aNickname char(15) not null unique,
aPassword blob(512) not null,
aEmail char(50) not null unique,
aGender char(6) not null,
aDate char(12)not null,
PRIMARY KEY(accID)
);


CREATE TABLE yahtzoid
(
ID int(1) not null unique AUTO_INCREMENT,
aLvl int not null,
aGold int,
aXP int,
Foreign key (ID) REFERENCES metaAcc (accID)
);

INSERT INTO metaacc (aNickname, aPassword, aEmail, aGender,aDate)
value('Runnetty2', AES_ENCRYPT('good','kk'),'mats19922@gmail.com', 'male', '10.12.92');

INSERT INTO metaAcc_Details (aEmail, aGender,aDate)
VALUE('mats1992@gmail.com', 'male', '10.12.92');

INSERT INTO yahtzoid (aLvl, aGold,aXP)
VALUE(1,1000,0);

DROP table yahtzoid,metaAcc;

DROP table metaAcc;
DROP table yahtzoid;