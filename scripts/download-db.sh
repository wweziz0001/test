#!/bin/bash

# Download Huda Allah Database
# تحميل قاعدة بيانات هدى الله

echo "=== تحميل قاعدة بيانات هدى الله ==="
echo "=== Downloading Huda Allah Database ==="

# Create db directory if not exists
mkdir -p db

# Download database from GitHub release or backup location
DB_URL="${1:-https://github.com/wweziz0001/Huda_allah_analysis/releases/download/v1.0/main_db@2.zip}"

echo "Downloading from: $DB_URL"
echo "جاري التحميل من: $DB_URL"

# Download and extract
if command -v wget &> /dev/null; then
    wget -O db/database.zip "$DB_URL"
elif command -v curl &> /dev/null; then
    curl -L -o db/database.zip "$DB_URL"
else
    echo "Error: Neither wget nor curl is available"
    echo "خطأ: wget أو curl غير متاح"
    exit 1
fi

# Extract database
echo "Extracting database..."
echo "جاري فك الضغط..."
unzip -o db/database.zip -d db/

# Rename to expected name
if [ -f db/main_db@2.sqlite ]; then
    mv db/main_db@2.sqlite db/huda_allah.db
fi

# Cleanup
rm -f db/database.zip

echo ""
echo "=== تم بنجاح! ==="
echo "=== Success! ==="
echo "Database location: db/huda_allah.db"
echo "موقع قاعدة البيانات: db/huda_allah.db"
