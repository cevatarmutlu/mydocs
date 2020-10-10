db.createUser(
    {
        roles: [
            {
                role: "readWrite",
                db: "mongo-rest"
            }
        ]
    }
);