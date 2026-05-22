-- src/db/schema.sql

-- Transactions table for core financial tracking
CREATE TABLE IF NOT EXISTS transactions (
  id UUID PRIMARY KEY,
  amount DECIMAL(12, 2) NOT NULL,
  type TEXT NOT NULL CHECK (type IN ('income', 'expense', 'daily', 'savings', 'credit')),
  date TIMESTAMP WITH TIME ZONE NOT NULL,
  description TEXT,
  tag_id TEXT,
  is_recurring BOOLEAN DEFAULT FALSE
);

-- Budget categories for daily allowance calculation
CREATE TABLE IF NOT EXISTS budget_categories (
  id UUID PRIMARY KEY,
  name TEXT NOT NULL,
  monthly_amount DECIMAL(12, 2) NOT NULL
);

-- Tags for categorization
CREATE TABLE IF NOT EXISTS tags (
  id UUID PRIMARY KEY,
  name TEXT NOT NULL,
  color TEXT
);

-- Configuration table for user settings and profile
CREATE TABLE IF NOT EXISTS config (
  key TEXT PRIMARY KEY,
  value TEXT
);

-- Daily status for check-ins
CREATE TABLE IF NOT EXISTS daily_status (
  date TEXT PRIMARY KEY,
  is_checked BOOLEAN DEFAULT FALSE
);
