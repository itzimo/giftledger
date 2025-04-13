# 🎁 GiftLedger - 线上人情簿管理系统

**GiftLedger** 是一个基于Java开发的线上人情簿管理工具，旨在简化用户记录和管理人情往来的过程。

---

## ✨ 功能特性

- 📖 **人情记录**：添加、编辑、删除人情记录（姓名、日期、金额、事由等）。
- 🔍 **查询统计**：按时间、姓名、金额等条件筛选和统计。
- 📊 **数据可视化**：生成年度/月度礼金收支图表。
- 📲 **多端同步**：支持Web/Android/iOS（可选，如果计划扩展）。
- 🔒 **数据安全**：本地加密存储或云端备份（可选）。

---

## 🛠️ 技术栈

- **后端**：Java (Spring Boot)
- **前端**：Thymeleaf/Vue
- **数据库**：MySQL
- **构建工具**：Maven

---

## 📚 项目结构

GiftLedger/  
├── src/  
│ ├── main/  
│ │ ├── java/ # Java源代码  
│ │ │ ├── com/itzimo/giftledger/  
│ │ │ │ ├── controller # 控制层（Spring Boot）  
│ │ │ │ ├── service # 业务逻辑  
│ │ │ │ ├── model # 数据模型  
│ │ │ │ └── dao # 数据库访问  
│ │ └── resources/ # 配置文件/静态资源  
│ └── test/ # 单元测试  
├── pom.xml # Maven依赖管理  
└── README.md # 项目说明

---

## 🚀 快速开始

### 环境要求

- JDK 1.8
- Maven 3.8+
- MySQL 8.0+

### 运行步骤

1. **克隆项目**
   ```bash
   git clone https://github.com/itzimo/GiftLedger.git
   cd GiftLedger